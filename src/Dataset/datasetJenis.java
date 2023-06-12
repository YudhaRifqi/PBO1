/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import yudharifqiananta_2110010430_4o.Jenis;

/**
 *
 * @author USER
 */
public class datasetJenis extends Jenis {
    private ArrayList<String>  id;
    private ArrayList<String>  jenis;
    
    public datasetJenis(){
        id = new ArrayList<>();
        jenis = new ArrayList<>();
    }
    
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    
    public void addjenis(String value){
        this.jenis.add(value);
    }
    
    public ArrayList<String> getDataJenis(){
        return this.jenis;
    }
    
}
