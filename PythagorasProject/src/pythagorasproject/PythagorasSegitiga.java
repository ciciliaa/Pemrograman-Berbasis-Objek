/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author HP
 */
public class PythagorasSegitiga {

    private double c;
    void cek(int a, int b, int c){
        int cek = (int) Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
        
        if(c == Math.pow(c, 2)){
            System.out.println("Termasuk triple pythagoras");
        } else{
            System.out.println("Tidak termasuk triple pythagoras");
        }
    }
    
    double miring(int a, int b){
        return Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
    }
    
    double siku(int a, int c){
        return Math.sqrt(Math.pow(a, 2) - (Math.pow(c, 2)));
    }
}
