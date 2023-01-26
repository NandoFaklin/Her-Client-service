/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Penjualanservice.VO;

import com.nando.Penjualanservice.entity.penjualan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ACER
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
     private pelanggan penjualan;
     private pelanggan pelanggan;

    public void setpenjualan(penjualan penjualan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setpelanggan(pelanggan pelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
