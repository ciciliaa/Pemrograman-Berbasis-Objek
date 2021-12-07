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
public class Mpv extends BahanBakar {
    
    private double mpv = 14;
    private double sl_bw = 540;
    private double sl_jbr = 433;
    private double mblE = 64;
    private double mblF = 53;
    
    public void output(){
        //hitung waktu, dan bahan bakar minimal
        double bbm_min_bw = this.sl_bw / this.mpv;
        double bbm_min_bw_fix = Math.round(bbm_min_bw * 100.0)/100.0;
        
        double bbm_min_jbr = this.sl_jbr / this.mpv;
        double bbm_min_jbr_fix = Math.round(bbm_min_jbr * 100.0)/100.0;
        
        //waktu
        double waktu_e = this.sl_bw / this.mblE;
        double waktu_f = this.sl_jbr / this.mblF;
        double waktu_fix_e = Math.round(waktu_e * 100.0)/100.0;
        double waktu_fix_f = Math.round(waktu_f * 100.0)/100.0;
        
        //tampilan 
        System.out.println("Mobil E   |   MPV   |   Kecepatan : "+mblE+" km/h  |   Solo-Banyuwangi : "+sl_bw+" km     |  min BBM : "+bbm_min_bw_fix+ "L  |  Waktu : "+waktu_fix_e+" Jam ");
        System.out.println("Mobil F   |   MPV   |   Kecepatan : "+mblF+" km/h  |   Solo-Jember : "+sl_jbr+" km         |  min BBM : "+bbm_min_jbr_fix+ "L  |  Waktu : "+waktu_fix_f+" Jam ");
 
    }
}
