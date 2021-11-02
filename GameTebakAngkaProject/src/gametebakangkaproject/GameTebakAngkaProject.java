/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class GameTebakAngkaProject {

    private static int tebak;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int angka = (int) (Math.random() * 100);
        System.out.println("Hai.. nama saya Mr.Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        
        do{
            System.out.println("Masukkan Tebakan Anda : ");
            Scanner input = new Scanner(System.in);
            int tebak = input.nextInt();
            
        if(tebak < angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
        } else if(tebak > angka){
            System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
        } else {
            System.out.println("Yeeee... Bilangan tebakan anda BENAR :-) ");
            break;
        }
        } while (tebak != angka);
        
    }
    
}
