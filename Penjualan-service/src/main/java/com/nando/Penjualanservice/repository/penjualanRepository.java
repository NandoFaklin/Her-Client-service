/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Penjualanservice.repository;

import com.nando.Penjualanservice.entity.penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACER
 */
@Repository
public interface penjualanRepository extends JpaRepository<penjualan, Long> {

    public penjualan findBypenjualanId(Long penjualanId);

}
