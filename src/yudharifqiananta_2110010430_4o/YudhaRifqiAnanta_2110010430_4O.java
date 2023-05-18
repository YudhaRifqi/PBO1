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
        
    }
    
}
