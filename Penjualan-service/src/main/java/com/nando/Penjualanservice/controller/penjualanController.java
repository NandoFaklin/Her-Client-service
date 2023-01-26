/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Penjualanservice.controller;

import com.nando.Penjualanservice.VO.ResponseTemplateVO;
import com.nando.Penjualanservice.entity.penjualan;
import com.nando.Penjualanservice.service.penjualanService;
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
@RequestMapping("/peminjaman")
public class penjualanController {
    @Autowired
    private penjualanService penjualanService;
    
    @PostMapping("/")
    public penjualan savepenjualan(@RequestBody penjualan penjualan){
        return penjualanService.savepenjualan(penjualan);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVO getpenjualan(@PathVariable("id") Long penjualanId){
        return penjualanService.getpenjualan(penjualanId);
    }
}
