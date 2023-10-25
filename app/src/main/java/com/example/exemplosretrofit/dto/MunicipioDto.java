package com.example.exemplosretrofit.dto;

import java.util.ArrayList;

public class MunicipioDto {

    private ArrayList<DadosMunicipio> dados;

    public ArrayList<DadosMunicipio> getDados(){
        return dados;
    }

    public void setDados(ArrayList<DadosMunicipio> dados){
        this.dados = dados;
    }
}
