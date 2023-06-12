/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import yudharifqiananta_2110010430_4o.Mobil;

/**
 *
 * @author USER
 */
public class datasetMobil extends Mobil{
    private ArrayList<String>  id_mobil;
    private ArrayList<String>  id_jenis;
    private ArrayList<String>  no_mobil;
    private ArrayList<String>  merk;
    private ArrayList<String>  nama_mobil;
    private ArrayList<String>  harga;
    private ArrayList<String>  status;
       
    
    public datasetMobil(){
        id_mobil = new ArrayList();
        id_jenis = new ArrayList();
        no_mobil = new ArrayList();
        merk = new ArrayList();
        nama_mobil = new ArrayList();
        harga = new ArrayList();
        status = new ArrayList();
        
        
    }
    
    public void addIdMobil(String value){
        this.id_mobil.add(value);
    }
    
    public ArrayList<String> getDataIdMobil(){
        return this.id_mobil;
    }
    
    public void addIdJenis(String value){
        this.id_jenis.add(value);
    }
    
    public ArrayList<String> getDataIdJenis(){
        return this.id_jenis;
    }
    
    public void addNoMobil(String value){
        this.no_mobil.add(value);
    }
    
    public ArrayList<String> getDataNoMobil(){
        return this.no_mobil;
    }
    
    public void addMerk(String value){
        this.merk.add(value);
    }
    
    public ArrayList<String> getDataMerk(){
        return this.merk;
    }
    
    public void addNama(String value){
        this.nama_mobil.add(value);
    }
    
    public ArrayList<String> getDataMobil(){
        return this.nama_mobil;
    }
    
    public void addharga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataharga(){
        return this.harga;
    }
    
    public void addstatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDatastatus(){
        return this.status;
    }
    
}
