package com.example.exemplosretrofit.service;

import com.example.exemplosretrofit.dto.MunicipioDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IBGEService {

    @GET("localidades/estado/{UF}/municipios")
    Call<MunicipioDto> municipiosPorUf(@Path("UF") String uf);

}
