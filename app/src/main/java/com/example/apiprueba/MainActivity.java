package com.example.apiprueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.apiprueba.digitalapi.DIgitalApiService;
import com.example.apiprueba.hotelapi.HotelApiService;
import com.example.apiprueba.models.Digital;
import com.example.apiprueba.models.Hotel;
import com.example.apiprueba.models.Turistico;
import com.example.apiprueba.turisticoapi.TuristicoApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewHotel;
    private RecyclerViewAdaptador adaptadorHotel;
    public  ArrayList lista1;
    public  ArrayList puntoViveDigital;
    public  ArrayList hotelRestaurante;
    public  ArrayList sitioTuristico;
    public TextView nombre;


    private  Retrofit retrofit;
    private static final String TAG="HOTEL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recyclerViewHotel = (RecyclerView)findViewById(R.id.recycler_hotel);
        //recyclerViewHotel.setLayoutManager(new LinearLayoutManager(this));
        //adaptadorHotel =new RecyclerViewAdaptador(this);


        //adaptadorHotel=new RecyclerViewAdaptador(obtenerHotel());
        //recyclerViewHotel.setAdapter(adaptadorHotel);
        //recyclerViewHotel.setAdapter(adaptadorHotel);
        //recyclerViewHotel.setHasFixedSize(true);

        //final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        //recyclerViewHotel.setLayoutManager(layoutManager);

        /*
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerDatos();

        nombre = findViewById(R.id.textView1);

        nombre.setText("hol");*/
/*
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
        });*/


    }/*
    public ArrayList<com.example.apiprueba.models.Hotel> obtenerHotel(){
        ArrayList<com.example.apiprueba.models.Hotel> hotel=lista1;
        return hotel;
    }*/

    public void  Restaurantes(View view){
        Intent restaurantes = new Intent(this, Main2Activity.class);
        startActivity(restaurantes);
    }

    public void  Turisticos(View view){
        Intent turisticos = new Intent(this, Main3Activity.class);
        startActivity(turisticos);
    }

    public void  Puntoa(View view){
        Intent puntos = new Intent(this, Main4Activity.class);
        startActivity(puntos);
    }
}
