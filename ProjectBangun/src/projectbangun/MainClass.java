/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

/**
 *
 * @author HP
 */

import bangundatar.*;
import bangunruang.*;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====================================");
        System.out.println("============BANGUN DATAR============");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("--------------Persegi---------------");
        Persegi p = new Persegi();
        p.sisi = 10;
        p.tampilHasil();
        
        System.out.println("");
        System.out.println("--------------Lingkaran-------------");
        Lingkaran l = new Lingkaran();
        l.r = 14;
        l.tampilHasil();
        
        System.out.println("");
        System.out.println("-----------Persegi Panjang----------");
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 20;
        pp.lebar = 10;
        pp.tampilHasil();
        
        System.out.println("");
        
        System.out.println("====================================");
        System.out.println("============BANGUN RUANG============");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("---------------Tabung---------------");
        Tabung t = new Tabung();
        t.r = 14;
        t.tinggi = 20;
        t.tampilHasil();
        
        System.out.println("");
        System.out.println("---------------Balok----------------");
        Balok bl = new Balok();
        bl.panjang = 20;
        bl.lebar = 10;
        bl.tinggi = 15;
        bl.tampilHasil();
        
        System.out.println("");
        System.out.println("----------------Bola----------------");
        Bola b = new Bola();
        b.r = 21;
        b.tampilHasil();
        
    }
}
