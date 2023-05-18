/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yudharifqiananta_2110010430_4o;

/**
 *
 * @author USER
 */
public class Jenis {
    private String idjenis;
    private String nama;
    
    public Jenis(){}

    public String getIdjenis() {
        return idjenis;
    }

    public void setIdjenis(int id) {
        if(id == 1){
            idjenis = "Sedan";
        }else if(id == 2){
            idjenis = "Sport";
        }else if(id == 3){
            idjenis = "SUV";
        }else if (id == 4){
            idjenis = "MPV";
        }else if (id == 5){
            idjenis = "Jeep";
        }
        else{
            idjenis = "Jenis Mobil Tidak Ada";
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
    
    

    
    
    
    
}
