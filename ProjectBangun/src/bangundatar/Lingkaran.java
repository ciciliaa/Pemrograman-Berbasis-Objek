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
public class Lingkaran extends BangunDatar {
    
    public double r;
    
    @Override
    public double hitungLuas(){
        double luas = Math.round(Math.PI * this.r * this.r);
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = Math.round(2 * Math.PI * this.r);
        return keliling;
    }
}
