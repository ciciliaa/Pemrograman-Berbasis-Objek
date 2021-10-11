/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author HP
 */
public class Ubin {
    //panjang ubin
    int panjang;
    //lebar ubin
    int lebar;
    
    //menghitung luas sebuah ubin
    int hitungLuas(){
        PersegiPanjang pp = new PersegiPanjang();
        return pp.hitungLuas(this.panjang, this.lebar);
    
    }
}
