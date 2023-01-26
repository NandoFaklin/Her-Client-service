/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Pelangganservice.repository;

import com.nando.Pelangganservice.entity.pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACER
 */
@Repository
public interface pelangganRepository extends JpaRepository<pelanggan, Long> {

    public pelanggan findBypelangganId(Long pelangganId);
    
}