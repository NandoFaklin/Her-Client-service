/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.Client_2101082028.controller;

import com.nando.Client_2101082028.FormPeminjaman;
import com.nando.Client_2101082028.model.Peminjaman;
import com.nando.Client_2101082028.service.PeminjamanService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class PeminjamanController {
    private final PeminjamanService peminjamanService;
    private final FormPeminjaman formPeminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanService = new PeminjamanService();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtPeminjamanId().setText("");
        formPeminjaman.getTxtAnggotaId().setText("");
        formPeminjaman.getTxtBukuId().setText("");
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void getPeminjamanId(){
        Long id = Long.parseLong(formPeminjaman.getTxtPeminjamanId().getText()); 
       Peminjaman peminjaman = peminjamanService.getPeminjaman(id);
        if(peminjaman !=null){
            formPeminjaman.getTxtAnggotaId().setText(peminjaman.getAnggotaId().toString());
            formPeminjaman.getTxtBukuId().setText(peminjaman.getBukuId().toString());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglkembali());
        }else {
            JOptionPane.showMessageDialog(formPeminjaman, "Data tidak ada");
        }
    }
    
    public void savePeminjaman(){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setAnggotaId(Long.parseLong(formPeminjaman
                .getTxtAnggotaId().getText()));
        peminjaman.setBukuId(Long.parseLong(formPeminjaman
                .getTxtBukuId().getText()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjaman = peminjamanService.savePeminjaman(peminjaman);
        if(peminjaman != null){
            formPeminjaman.getTxtPeminjamanId().setText(peminjaman.getPeminjamanId().toString());
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Gagal");
        }
    }
    
    public void updatePeminjaman(){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setPeminjamanId(Long.parseLong(formPeminjaman.getTxtPeminjamanId().getText()));
        peminjaman.setAnggotaId(Long.parseLong(formPeminjaman.getTxtAnggotaId().getText()));
        peminjaman.setBukuId(Long.parseLong(formPeminjaman.getTxtBukuId().getText()));
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        if(peminjaman!= null){
            formPeminjaman.getTxtPeminjamanId().setText(peminjaman.getPeminjamanId().toString());
            JOptionPane.showMessageDialog(formPeminjaman, "Update Data Berhasil");
        }else{
            JOptionPane.showMessageDialog(formPeminjaman, "Update Data Gagal");
        }
    }
    
    public void deletePeminjaman(){
        Long id = Long.parseLong(formPeminjaman.getTxtPeminjamanId().getText());
        peminjamanService.deletePeminjaman(id);
        JOptionPane.showMessageDialog(formPeminjaman, "Delete Data Berhasil");
    }
    
    public void viewTabel(){
        DefaultTableModel tableModel = (DefaultTableModel)
                formPeminjaman.getTablePeminjaman().getModel();
        tableModel.setRowCount(0);
        List<Peminjaman> peminjamanList =peminjamanService.getAllPeminjaman();
        for (Peminjaman peminjaman : peminjamanList){
            Object[] row = {
                peminjaman.getBukuId(),
                peminjaman.getAnggotaId(),
                peminjaman.getBukuId(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
            };
            tableModel.addRow(row);
        }
    }
}
