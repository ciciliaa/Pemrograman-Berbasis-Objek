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
public class BangunDatarMain {
    public static void main(String[] args){
        PersegiPanjang op1 = new PersegiPanjang();
        op1.panjang = 25;
        op1.lebar = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        
        Persegi a = new Persegi();
        a.sisi = 10;
        a.hitungLuas();
        a.hitungKeliling();
        
        Persegi b = new Persegi();
        b.sisi= 15;
        b.hitungLuas();
        b.hitungKeliling();
                
        Lingkaran la = new Lingkaran();
        la.r = 25;
        la.hitungLuas();
        la.hitungKeliling();
        
        Lingkaran lb = new Lingkaran();
        lb.r = 37;
        lb.hitungLuas();
        lb.hitungKeliling();
    }
}
