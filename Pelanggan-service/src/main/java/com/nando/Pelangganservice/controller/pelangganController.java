/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Pelangganservice.controller;

import com.nando.Pelangganservice.entity.pelanggan;
import com.nando.Pelangganservice.service.pelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ACER
 */
@RestController
@RequestMapping("/pelanggan")
public class pelangganController {
     @Autowired
    private pelangganService pelangganService;
    
    @PostMapping("/")
    public pelanggan savepelanggan(@RequestBody pelanggan pelanggan){
        return pelangganService.savepelanggan(pelanggan);
    }
    
    @GetMapping("/{id}")
    public pelanggan findpelangganById(@PathVariable("id") Long pelangganId){
        return pelangganService.findpelangganById(pelangganId);
    }
}
