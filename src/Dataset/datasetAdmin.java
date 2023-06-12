/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import yudharifqiananta_2110010430_4o.Admin;

/**
 *
 * @author USER
 */
public class datasetAdmin extends Admin{
    private ArrayList<String>  id;
    private ArrayList<String>  nama;
    private ArrayList<String>  email;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    
    public datasetAdmin(){
        id = new ArrayList<>();
        nama = new ArrayList<>();
        email = new ArrayList<>();
        alamat = new ArrayList<>();
        telepon = new ArrayList<>();
    }
    
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getDataEmail(){
        return this.email;
    }
    
    public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
    public void addTelepon(String value){
        this.telepon.add(value);
    }
    
    public ArrayList<String> getDataTelepon(){
        return this.telepon;
    }
}
