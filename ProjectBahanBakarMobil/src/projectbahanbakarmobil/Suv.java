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
public class Suv extends BahanBakar {
    
    private double suv = 12;
    private double sl_btn = 662;
    private double sl_bdg = 534;
    private double mblC = 57;
    private double mblD = 62;
        
    public void output(){
        
        double bbm_min_btn = this.sl_btn / this.suv;
        double bbm_min_btn_fix = Math.round(bbm_min_btn * 100.0)/100.0;
        
        double bbm_min_bdg = this.sl_bdg / this.suv;
        Math.ceil(bbm_min_bdg);
        
        //waktu
        double waktu_c = this.sl_btn / this.mblC;
        double waktu_d = this.sl_bdg / this.mblD;
        double waktu_fix_c = Math.round(waktu_c * 100.0)/100.0;
        double waktu_fix_d = Math.round(waktu_d * 100.0)/100.0;
        
        //tampilan 
        System.out.println("Mobil C   |   SUV   |   Kecepatan : "+mblC+" km/h  |   Solo-Banten: "+sl_btn+" km     |  min BBM : "+bbm_min_btn_fix+ "L  |  Waktu : "+waktu_fix_c+" Jam ");
        System.out.println("Mobil D   |   SUV   |   Kecepatan : "+mblD+" km/h  |   Solo-Bandung: "+sl_bdg+" km    |  min BBM : "+bbm_min_bdg+ "L   |  Waktu : "+waktu_fix_d+" Jam ");
    }
}
