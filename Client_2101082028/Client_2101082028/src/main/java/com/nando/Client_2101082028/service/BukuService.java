/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Client_2101082028.service;

import com.google.gson.Gson;
import com.nando.Client_2101082028.model.Buku;
import java.util.List;
import kong.unirest.GenericType;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author USER
 */
public class BukuService {
    private final String URL = "http://localhost:9003";
    
    public Buku getBuku(Long bukuId){
        Buku buku = Unirest.get(URL+"/buku/"+bukuId)
                .asObject(Buku.class)
                .getBody();
        if(buku!=null){
            return buku;
        }
        return null;
    }
    
    public Buku saveBuku(Buku buku){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/buku/")
                .header("content-type", "application/json")
                .body(buku)
                .asJson();
        Gson gson = new Gson();
        Buku a = gson.fromJson(response.getBody().toString(), Buku.class);
        return a;
    }
    
    public List<Buku> getAllBuku(){
        java.util.List<Buku> bukuList = Unirest.get(URL + "/buku/")
                .asObject(new GenericType<java.util.List<Buku>>(){})
                .getBody();
        return bukuList;
    }
    
    public Buku updateBuku(Buku buku){
        HttpResponse<JsonNode> response = Unirest.put(URL + "/buku/")
                .header("content-type", "application/json")
                .body(buku)
                .asJson();
        Gson gson = new Gson();
        Buku a = gson.fromJson(response.getBody().toString(), Buku.class);
        return a;
    }
    
    public void deleteBuku(Long bukuId){
        Unirest.delete(URL + "/buku/"+bukuId).asEmpty();
    }
}


