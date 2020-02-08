package com.example.apiprueba.hotelapi;

import com.example.apiprueba.models.Hotel;
import com.example.apiprueba.models.HotelRespuesta;
import com.example.apiprueba.models.Turistico;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HotelApiService {

    @GET("resource/y353-sjz7.json")
    Call<ArrayList<Hotel>> obtenerListaHotel();


}
