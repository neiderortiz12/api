package com.example.apiprueba.digitalapi;

import com.example.apiprueba.models.Digital;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DIgitalApiService {

    @GET("resource/ycju-3zn9.json")
    Call<ArrayList<Digital>> obtenerListaDigial();
}
