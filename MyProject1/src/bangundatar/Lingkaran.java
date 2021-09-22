/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author HP
 */
public class Lingkaran {
    
    // attribut
    public int r;
    
    // methods
    public void hitungLuas(){
        double hasil = 3.14 * r * r;
        System.out.println("Luas Lingkaran adalah : " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * 3.14 * r;
        System.out.println("Keliling Lingkaran adalah : " + hasil);
    }
}
