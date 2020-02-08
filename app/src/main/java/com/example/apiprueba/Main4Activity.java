package com.example.apiprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.apiprueba.digitalapi.DIgitalApiService;
import com.example.apiprueba.models.Digital;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main4Activity extends AppCompatActivity {

    public ArrayList puntoViveDigital;
    private Retrofit retrofit;
    private static final String TAG="HOTEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerDatos();
    }

    private void obtenerDatos(){
        DIgitalApiService service2 = retrofit.create(DIgitalApiService.class);
        Call<ArrayList<Digital>> digitalRespuestaCall =service2.obtenerListaDigial();
        digitalRespuestaCall.enqueue(new Callback<ArrayList<Digital>>() {
            @Override
            public void onResponse(Call<ArrayList<Digital>> call, Response<ArrayList<Digital>> response) {
                if(response.isSuccessful()){
                    puntoViveDigital = response.body();

                    for(int i=0;i<puntoViveDigital.size();i++){
                        Digital digital  =(Digital) puntoViveDigital.get(i);

                        Log.i(TAG, "Punto viveDigital1: "+digital.getNombreDelPuntoViveDigital());

                    }
                }else
                {
                    Log.e(TAG,"onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Digital>> call, Throwable t) {
                Log.e(TAG,"onFailure:"+t.getMessage());
            }
        });
    }

    public void  Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}
