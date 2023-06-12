/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import yudharifqiananta_2110010430_4o.Pembayaran;
/**
 *
 * @author USER
 */
public class datasetPembayaran extends Pembayaran {
    private ArrayList<String>  konfirmasi;
    private ArrayList<String>  transaksi;
    private ArrayList<String>  bukti;
    
    public datasetPembayaran(){
        konfirmasi = new ArrayList();
        transaksi = new ArrayList();
        bukti = new ArrayList();
    }
    
    public void addtransaksi(String value){
        this.transaksi.add(value);
    }
    
    public ArrayList<String> getDatatransaksi(){
        return this.transaksi;
    }
    
    public void addkonfirmasi(String value){
        this.konfirmasi.add(value);
    }
    
    public ArrayList<String> getDatakonfirmasi(){
        return this.konfirmasi;
    }
    public void addbukti(String value){
        this.bukti.add(value);
    }
    
    public ArrayList<String> getDatabukti(){
        return this.bukti;
    }
    
}
