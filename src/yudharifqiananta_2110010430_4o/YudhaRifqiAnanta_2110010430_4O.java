/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yudharifqiananta_2110010430_4o;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class YudhaRifqiAnanta_2110010430_4O {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ADMIN
        Admin a = new Admin();
        a.setId_admin("ADM001");
        a.setNama("Fauziyannor");
        a.setEmail("fauziyannor@gmail.com");
        a.setAlamat("Banjarmasin");
        a.setTelp("081256569898");
        System.out.println("ID ADMIN   = " + a.getId_admin());
        System.out.println("Nama       = " + a.getNama());
        System.out.println("Email      = " + a.getEmail());
        System.out.println("Alamat     = " + a.getAlamat());
        System.out.println("Telpon     = " + a.getTelp());
        System.out.println("===========================");
        
        //COSTUMER
        Costumer c = new Costumer();
        c.setId_pelanggan("C001");
        c.setNo_hp("087816104232");
        c.setNama("Yudha Rifqi Ananta");
        c.setEmail("yudha.rifki.ananta@gmail.com");
        c.setAlamat("Banjarmasin");
        System.out.println("ID PELANGGAN = " + c.getId_pelanggan());
        System.out.println("No HP        = " + c.getNo_hp());
        System.out.println("Nama         = " + c.getNama());
        System.out.println("Email        = " + c.getEmail());
        System.out.println("Alamat       = " + c.getAlamat());
        System.out.println("======================================");

        
        
        //MOBIL DAN JENIS
        Mobil m = new Mobil();
        m.setId_mobil("M001");
        m.setIdjenis(5);
        m.setNo_mobil("2003");
        m.setMerk("Honda");
        m.setNama_mobil("HRV");
        m.setHarga("400.000.000");
        m.setStatus("Baru");
        System.out.println("ID MOBIL   = " + m.getId_mobil());
        System.out.println("JENIS      = " + m.getIdjenis());
        System.out.println("NO MOBIL   = " + m.getNo_mobil());
        System.out.println("MERK       = " + m.getMerk());
        System.out.println("NAMA MOBIL = " + m.getNama_mobil());
        System.out.println("HARGA      = " + m.getHarga());
        System.out.println("STATUS     = " + m.getStatus());
        System.out.println("======================================");
        
        
        //Sewa
        Sewa s = new Sewa();
        s.setId_transaksi("T001");
        s.setId_pelanggan("C001");
        s.setId_mobil("M001");
        s.setTgl_sewa("29-05-2023");
        s.setTgl_ambil("29-05-2023");
        s.setTgl_kembali("10-06-2023");
        s.setLama("13 HARI");
        s.setTotal_harga("6.200.000");
        s.setStatus("CASH");
        s.setJaminan("KTP");
        s.setDenda("-");
        s.setJatuh_tempo("10-06-2023");
        s.setKonfimasi("-");
        s.setPembatalan("-");
        System.out.println("ID TRANSAKSI   = " + s.getId_transaksi());
        System.out.println("ID PELANGGAN   = " + s.getId_pelanggan());
        System.out.println("ID MOBIL       = " + s.getId_mobil());
        System.out.println("TGL SEWA       = " + s.getTgl_sewa());
        System.out.println("TGL AMBIL      = " + s.getTgl_ambil());
        System.out.println("TGL KEMBALI    = " + s.getTgl_kembali());
        System.out.println("LAMA           = " + s.getLama());
        System.out.println("TOTAL HARGA    = " + s.getTotal_harga());
        System.out.println("STATUS         = " + s.getStatus());
        System.out.println("JAMINAN        = " + s.getJaminan());
        System.out.println("DENDA          = " + s.getDenda());
        System.out.println("JATUH TEMPO    = " + s.getJatuh_tempo());
        System.out.println("KONFIMASI      = " + s.getKonfimasi());
        System.out.println("PEMBATALAN     = " + s.getPembatalan());
        System.out.println("======================================");
        
        
        //Pembayaran
        Pembayaran p = new Pembayaran();
        p.setId_konfirmasi("P001");
        p.setId_transaksi("T001");
        p.setBukti("Transfer");
        System.out.println("ID KONFIRMASI = " + p.getId_konfirmasi());
        System.out.println("ID TRANSAKSI  = " + p.getId_transaksi());
        System.out.println("BUKTI         = " + p.getBukti());
        System.out.println("======================================");
        
        //Laporan
        Laporan l = new Laporan();
        l.setTransaksi("T001");
        l.setCostumer("C001");
        l.setMobil("M001");
        System.out.println("TRANSAKSI = " + l.getTransaksi());
        System.out.println("COSTUMER  = " + l.getCostumer());
        System.out.println("MOBIL     = " + l.getMobil());
        System.out.println("======================================");
    }
    
}
