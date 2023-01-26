/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Penjualanservice.service;

import com.nando.Penjualanservice.VO.ResponseTemplateVO;
import com.nando.Penjualanservice.VO.pelanggan;
import com.nando.Penjualanservice.entity.penjualan;
import com.nando.Penjualanservice.repository.penjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ACER
 */
@Service
public class penjualanService {

    public static penjualan savepenjualan(penjualan penjualan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Autowired
    private penjualanRepository penjualanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public penjualan savePenjualan(penjualan penjualan){
        return penjualanRepository.save(penjualan);
    }
    
    public ResponseTemplateVO getpenjualan(Long penjualanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        penjualan penjualan = 
                penjualanRepository.findBypenjualanId(penjualanId);
        pelanggan pelanggan = 
        restTemplate.getForObject("http://localhost:9001/anggota/"
                + penjualan.getpelangganId(), pelanggan.class);
        vo.setpenjualan(penjualan);
        vo.setpelanggan(pelanggan); 
        return vo;
    }
    
}
