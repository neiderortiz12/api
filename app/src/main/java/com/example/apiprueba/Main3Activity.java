package com.example.apiprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.apiprueba.models.Turistico;
import com.example.apiprueba.turisticoapi.TuristicoApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main3Activity extends AppCompatActivity {

    public ArrayList sitioTuristico;
    private Retrofit retrofit;
    private static final String TAG="HOTEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerDatos();
    }
    private void obtenerDatos(){
        TuristicoApiService service1 = retrofit.create(TuristicoApiService.class);
        Call<ArrayList<Turistico>> turisticoRespuestaCall = service1.obtenerListaTuristico();

        turisticoRespuestaCall.enqueue(new Callback<ArrayList<Turistico>>() {
            @Override
            public void onResponse(Call<ArrayList<Turistico>> call, Response<ArrayList<Turistico>> response) {
                if(response.isSuccessful()){
                    sitioTuristico = response.body();

                    for(int i=0;i<sitioTuristico.size();i++){
                        Turistico turistico  =(Turistico)sitioTuristico.get(i);

                        Log.i(TAG, "Sitio: "+turistico.getIdsitio());

                    }
                }else
                {
                    Log.e(TAG,"onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Turistico>> call, Throwable t) {
                Log.e(TAG,"onFailure:"+t.getMessage());
            }
        });

    }

    public void  Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}
