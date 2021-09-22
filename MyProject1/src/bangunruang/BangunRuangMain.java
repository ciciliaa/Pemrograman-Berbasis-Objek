/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author HP
 */
public class BangunRuangMain {
    public static void main(String[] args){
        Bola op1 = new Bola();
        op1.r = 50;
        op1.hitungVol();
        op1.hitungLuasSelimut();
        
        Tabung op2 = new Tabung();
        op2.r = 50;
        op2.t = 100;
        op2.hitungVol();
        op2.hitungLuasSelimut();
        
        Kerucut op3 = new Kerucut();
        op3.r = 50;
        op3.t = 100;
        op3.s = 115;
        op3.hitungVol();
        op3.hitungLuasSelimut();
         
    }
}
