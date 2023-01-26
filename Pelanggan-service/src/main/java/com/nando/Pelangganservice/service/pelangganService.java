/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Pelangganservice.service;

import com.nando.Pelangganservice.entity.pelanggan;
import com.nando.Pelangganservice.repository.pelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class pelangganService {
    @Autowired
    private pelangganRepository pelangganRepository;
    
    public pelanggan savepelanggan(pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public pelanggan findpelangganById(Long pelangganId){
        return pelangganRepository.findBypelangganId(pelangganId);
    }
}
