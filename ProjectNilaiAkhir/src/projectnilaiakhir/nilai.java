/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectnilaiakhir;

/**
 *
 * @author HP
 */
public class nilai {
    private String nama, nim;
    private double tugas, uts, uas;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setTugas(double tugas){
        this.tugas = tugas;
    }
    
    public void setUTS(double uts){
        this.uts = uts;
    }
    
    public void setUAS(double uas){
        this.uas = uas;
    }
    
    //getter
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public double getTugas(){
        return tugas;
    }
    
    public double getUTS(){
        return uts;
    }
    
    public double getUAS(){
        return uas;
    }
    
    public double gethitungNilai(double hitungNilai){
        return hitungNilai;
    }
    
}
