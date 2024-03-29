package com.example.exemplosretrofit.controller;

import android.content.Context;
import android.util.Log;

import com.example.exemplosretrofit.dto.MunicipioDto;
import com.example.exemplosretrofit.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MunicipioController {

    public static void executarAPI(String uf, Context ctx){
        try {
            Call<MunicipioDto> call = new RetrofitConfig()
                    .ibgeService()
                    .municipiosPorUf(uf);

            call.enqueue(new Callback<MunicipioDto>() {
                @Override
                public void onResponse(Call<MunicipioDto> call, Response<MunicipioDto> response) {
                    MunicipioDto dto = response.body();
                }

                @Override
                public void onFailure(Call<MunicipioDto> call, Throwable t) {
                    Log.e("TESTE", "Erro ao comunicar com a API: " + t.getMessage());
                }
            });

        }catch (Exception ex){

        }
    }

}
