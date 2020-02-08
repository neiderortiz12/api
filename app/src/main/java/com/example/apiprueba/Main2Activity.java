package com.example.apiprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.apiprueba.hotelapi.HotelApiService;
import com.example.apiprueba.models.Hotel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {

    public ArrayList hotelRestaurante;
    private  Retrofit retrofit;
    private static final String TAG="HOTEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerDatos();
    }


    private void obtenerDatos(){

        HotelApiService service = retrofit.create(HotelApiService.class);
        Call<ArrayList<Hotel>> hotelRespuestaCall = service.obtenerListaHotel();

        hotelRespuestaCall.enqueue(new Callback<ArrayList<Hotel>>() {
            @Override
            public void onResponse(Call<ArrayList<Hotel>> call, Response<ArrayList<Hotel>> response) {
                if(response.isSuccessful()){
                    hotelRestaurante = response.body();

                    for(int i=0;i<hotelRestaurante.size();i++){
                        Hotel hotel =(Hotel)hotelRestaurante.get(i);

                        Log.i(TAG, "Hotel: "+hotel.getNombreDelHotel());

                    }
                }else
                {
                    Log.e(TAG,"onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Hotel>> call, Throwable t) {
                Log.e(TAG,"onFailure:"+t.getMessage());
            }
        });
    }

    public void  Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
