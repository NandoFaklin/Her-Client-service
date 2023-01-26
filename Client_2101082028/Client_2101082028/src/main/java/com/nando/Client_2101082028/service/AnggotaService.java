/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Client_2101082028.service;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import com.google.gson.Gson;
import com.nando.Client_2101082028.model.Anggota;
import java.util.List;
import kong.unirest.GenericType;
import kong.unirest.Unirest;

/**
 *
 * @author USER
 */
public class AnggotaService {
    private final String URL = "http://localhost:9001";
    
    public Anggota getAnggota(Long anggotaId){
        Anggota anggota = Unirest.get(URL+"/anggota/"+anggotaId).asObject(Anggota.class).getBody();
        if(anggota !=null){
            return anggota;
        }
        return null;
    }
    public Anggota saveAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/anggota/")
                .header("content-type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson ();
        Anggota a = gson.fromJson(response.getBody().toString(), Anggota.class);
        return a;
    }
    public List<Anggota> getAllAnggota(){
        List<Anggota> anggotaList = Unirest.get(URL + "/anggota/")
                .asObject(new GenericType<List<Anggota>>(){})
                .getBody();
        return anggotaList;
    }
    public Anggota updateAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.put(URL + "/anggota/")
                .header("content-type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson();
        Anggota a = gson.fromJson(response.getBody().toString(), Anggota.class);
        return a;
        
    }
    public void deleteAnggota(Long AnggotaId){
        Unirest.delete(URL + "/anggota/"+AnggotaId).asEmpty();
    }
    
}
