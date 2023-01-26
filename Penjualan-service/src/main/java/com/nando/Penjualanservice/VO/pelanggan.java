/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Penjualanservice.VO;

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
public class pelanggan {
    private String kodebarang;
    private String namabarang;
    private String harga;
    private String jumblah;
    private String total;
    private String diskon;
}
