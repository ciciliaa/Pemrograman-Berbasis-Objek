/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbahanbakarmobil;

/**
 *
 * @author HP
 */
public final class Sedan extends BahanBakar {
    
    private double sedan = 10;
    private double sl_kds = 159;
    private double sl_jkt = 538;
    private double mblA = 60;
    private double mblB = 65;
       
    public void output(){
        double bbm_min_kds = this.sl_kds / this.sedan;
        Math.ceil(bbm_min_kds);
        
        double bbm_min_jkt = this.sl_jkt / this.sedan;
        Math.ceil(bbm_min_jkt);
        
        double waktu_a = this.sl_kds / this.mblA;
        double waktu_b = this.sl_jkt / this.mblB;
        double waktu_fix_a = Math.round(waktu_a * 100.0)/100.0;
        double waktu_fix_b = Math.round(waktu_b * 100.0)/100.0;
        
        System.out.println("Mobil A   |   Sedan   |   Kecepatan : "+mblA+" km/h  |   Solo-Kudus: "+sl_kds+" km     |  min BBM : "+bbm_min_kds+ "L  |  Waktu : "+waktu_fix_a+" Jam ");
        System.out.println("Mobil B   |   Sedan   |   Kecepatan : "+mblB+" km/h  |   Solo-Jakarta: "+sl_jkt+" km   |  min BBM : "+bbm_min_jkt+ "L  |  Waktu : "+waktu_fix_b+" Jam ");
    }
    
    public void getOutput(){
        this.output();
    }
}
