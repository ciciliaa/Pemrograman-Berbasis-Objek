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
public class Pengiriman {
    int harga = 700000;
    int batas = 5;
    
    int pengiriman(int jarak, int armada){
        int kirim = harga * (jarak / batas) * armada;
        return kirim;
    }
    
    double pengiriman(double jarak, int armada){
        double kirim = harga * (jarak / batas) * armada;
        return kirim;
    }
    
    double pengiriman(int jarak, double armada){
        double kirim = harga * (jarak / batas) * armada;
        return kirim;
    }
    
    double pengiriman(double jarak, double armada){
        double kirim = harga * (jarak / batas) * armada;
        return kirim;
    }
    
}
