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

import java.util.Scanner;
public class PythagorasProject {

    private static String miring;
    private static String siku;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //keterangan
        System.out.println("Daftar menu pilihan");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Silahkan pilih nomer menu yang diinginkan :");
        
        PythagorasSegitiga p = new PythagorasSegitiga();
        
        switch(input.nextInt()){
            case 1:
                System.out.println("Masukkan nilai a :");
                int a = input.nextInt();
                System.out.println("Masukkan nilai b : ");
                int b = input.nextInt();
                System.out.println("Masukkan nilai c : ");
                int c = input.nextInt();
                p.cek(a, b, c);
                break;
            case 2:
                System.out.println("Masukkan nilai a : ");
                a = input.nextInt();
                System.out.println("Masukkan nilai b : ");
                b = input.nextInt();
                double resultMiring = p.miring(a, b);
                System.out.println("nilai sisi miring adalah : " + resultMiring);
                break;
            case 3:
                System.out.println("Masukkan nilai a : ");
                a = input.nextInt();
                System.out.println("Masukkan nilai c : ");
                c = input.nextInt();
                double resultSiku = p.siku(a, c);
                System.out.println("nilai sisi siku-siku adalah : " + resultSiku);
                break;
            case 4:
                System.out.println("program selesai");
                System.exit(0);
            default:
                System.out.println("Maaf, input anda tidak tepat");
        }
    }

}
