/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.bukuservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author USER
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Buku {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bukuId;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;
}

