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
public class Bola {
    
    // attribut
    public int r;
    
    // methods
    public void hitungVol(){
        double hasil = (4 / 3) * 3.14 * r * r * r;
        System.out.println("Volume Bola adalah : " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * 3.14 * r * r;
        System.out.println("Luas Selimut Bola adalah : " + hasil);
    }
}
