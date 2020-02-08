package com.example.apiprueba.turisticoapi;

import com.example.apiprueba.models.Turistico;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TuristicoApiService {

    @GET("resource/9g7t-zgqb.json")
    Call<ArrayList<Turistico>> obtenerListaTuristico();
}
