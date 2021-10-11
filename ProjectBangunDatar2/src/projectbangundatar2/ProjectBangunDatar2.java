/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author HP
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("keliling persegi panjang 1 = " + pp.keliling(10,5));
        System.out.println("luas persegi panjang 1 = " + pp.luas(10,5));
        System.out.println("keliling persegi panjang 2 = " + pp.keliling(3.6,8));
        System.out.println("luas persegi panjang 2 = " + pp.luas(3.6,8));
        System.out.println("keliling persegi panjang 3 = " + pp.keliling(6,8.3));
        System.out.println("luas persegi panjang 3 = " + pp.luas(6,8.3));
        System.out.println("keliling persegi panjang 4 = " + pp.keliling(5.6,8.8));
        System.out.println("luas persegi panjang 4 = " + pp.luas(5.6,8.8));
        
        System.out.println("--------------------------------------------------");
        
        Persegi p = new Persegi();
        System.out.println("keliling persegi 1 = " + p.keliling(4.5));
        System.out.println("luas persegi 1 = " + p.luas(4.5));
        System.out.println("keliling persegi 2 = " + p.keliling(7));
        System.out.println("luas persegi 2 = " + p.luas(7));
        
        System.out.println("--------------------------------------------------");
        
        Lingkaran l = new Lingkaran();
        System.out.println("keliling lingkaran 1 = " + l.keliling(5));
        System.out.println("luas lingkaran 1 = " + l.luas(5));
        System.out.println("keliling lingkaran 2 = " + l.keliling(7.4));
        System.out.println("luas lingkaran 2 = " + l.luas(7.4));
        
        System.out.println("--------------------------------------------------");
        
        Segitiga s = new Segitiga();
        System.out.println("keliling segitiga 1 = " + s.keliling(8,10));
        System.out.println("luas segitiga 1 = " + s.luas(8,10));
        System.out.println("keliling segitiga 2 = " + s.keliling(8,11.5));
        System.out.println("luas segitiga 2 = " + s.luas(8,11.5));
        System.out.println("keliling segitiga 3 = " + s.keliling(12.2,9));
        System.out.println("luas segitiga 3 = " + s.luas(12.2,9));
        System.out.println("keliling segitiga 4 = " + s.keliling(13.9,20.7));
        System.out.println("luas segitiga 4 = " + s.luas(13.9,20.7));
    }
    
}
