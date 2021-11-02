/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author HP
 */
public class Dana {
    Buah harga = new Buah();
    
    Pengiriman byl = new Pengiriman();
    Pengiriman slg = new Pengiriman();
    Pengiriman klt = new Pengiriman();
    Pengiriman kds = new Pengiriman();
    
    int dana_byl(){
        int total = byl.pengiriman(15, 2) + harga.buah(5000);
        return total;
    }
    
    int dana_slg(){
        int total = slg.pengiriman(35, 3) + harga.buah(7500);
        return total;
    }
    
    int dana_klt(){
        int total = klt.pengiriman(30, 4) + harga.buah(8300);
        return total;
    }
    
    int dana_kds(){
        int total = kds.pengiriman(75, 4) + harga.buah(9100);
        return total;
    }
}
