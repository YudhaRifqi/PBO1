/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import yudharifqiananta_2110010430_4o.Sewa;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetSewa extends Sewa {
    private ArrayList<String>  id_transaksi;
    private ArrayList<String>  id_pelanggan;
    private ArrayList<String>  id_mobil;
     private ArrayList<String>  tgl_sewa;
    private ArrayList<String>  tgl_ambil;
    private ArrayList<String>  tgl_kembali;
     private ArrayList<String>  lama;
    private ArrayList<String>  totalharga;
    private ArrayList<String>  status;
     private ArrayList<String>  jaminan;
    private ArrayList<String>  denda;
    private ArrayList<String>  jatuhtempo;
    
    public datasetSewa(){
        id_transaksi = new ArrayList();
        id_pelanggan = new ArrayList();
        id_mobil = new ArrayList();
        tgl_sewa = new ArrayList();
        tgl_ambil = new ArrayList();
        tgl_kembali = new ArrayList();
        lama = new ArrayList();
        totalharga = new ArrayList();
        status = new ArrayList();
        jaminan = new ArrayList();
        denda = new ArrayList();
        jatuhtempo = new ArrayList();
    }
    
    public void addidtransaksi(String value){
        this.id_transaksi.add(value);
    }
    
    public ArrayList<String> getDataidtransaksi(){
        return this.id_transaksi;
    }
    
    public void addid_pelanggan(String value){
        this.id_pelanggan.add(value);
    }
    
    public ArrayList<String> getDataid_pelanggan(){
        return this.id_pelanggan;
    }
    
    public void addid_mobil(String value){
        this.id_mobil.add(value);
    }
    
    public ArrayList<String> getDataid_mobil(){
        return this.id_mobil;
    }
    
    public void addtgl_sewa(String value){
        this.tgl_sewa.add(value);
    }
    
    public ArrayList<String> getDatatgl_sewa(){
        return this.tgl_sewa;
    }
    public void addtgl_ambil(String value){
        this.tgl_ambil.add(value);
    }
    
    public ArrayList<String> getDatatgl_ambil(){
        return this.tgl_ambil;
    }
    public void addtgl_kembali(String value){
        this.tgl_kembali.add(value);
    }
    
    public ArrayList<String> getDatatgl_kembali(){
        return this.tgl_kembali;
    }
    public void addlama(String value){
        this.lama.add(value);
    }
    
    public ArrayList<String> getDatalama(){
        return this.lama;
    }
    public void addtotalharga(String value){
        this.totalharga.add(value);
    }
    
    public ArrayList<String> getDatatotalharga(){
        return this.totalharga;
    }
    public void addstatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDatastatus(){
        return this.status;
    }
    
    public void addjaminan(String value){
        this.jaminan.add(value);
    }
    
    public ArrayList<String> getDatajaminan(){
        return this.jaminan;
    }
    
    public void adddenda(String value){
        this.denda.add(value);
    }
    
    public ArrayList<String> getDatadenda(){
        return this.denda;
    }
    
    public void addjatuhtempo(String value){
        this.jatuhtempo.add(value);
    }
    
    public ArrayList<String> getDatajatuhtempo(){
        return this.jatuhtempo;
    }
}
