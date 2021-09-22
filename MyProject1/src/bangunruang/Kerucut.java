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
public class Kerucut {
    
    // attribut
    public int r;
    public int t;
    public int s;
    
    // methods
    public void hitungVol(){
        double hasil = (1 / 3 ) * 3.14 * r * r * t;
        System.out.println("Volume Kerucut adalah : " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * r * s;
        System.out.println("Luas Selimut Kerucut adalah : " + hasil);
    }
}
