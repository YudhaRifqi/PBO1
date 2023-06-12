/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import yudharifqiananta_2110010430_4o.Laporan;
/**
 *
 * @author USER
 */
public class datasetLaporan extends Laporan {
    private ArrayList<String>  transaksi;
    private ArrayList<String>  costumer;
    private ArrayList<String>  mobil;
    
    public datasetLaporan(){
        transaksi = new ArrayList<>();
        costumer = new ArrayList<>();
        mobil = new ArrayList<>();
    }
    
    public void addtransaksi(String value){
        this.transaksi.add(value);
    }
    
    public ArrayList<String> getDatatransaksi(){
        return this.transaksi;
    }
    
    public void addcostumer(String value){
        this.costumer.add(value);
    }
    
    public ArrayList<String> getDatacostumer(){
        return this.costumer;
    }
    public void addmobil(String value){
        this.mobil.add(value);
    }
    
    public ArrayList<String> getDatamobil(){
        return this.mobil;
    }
    
    
}
