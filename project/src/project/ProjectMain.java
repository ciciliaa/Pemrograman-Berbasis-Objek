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

import java.util.Scanner;
public class ProjectMain {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Dana krm_byl = new Dana();
        Dana krm_slg = new Dana();
        Dana krm_klt = new Dana();
        Dana krm_kds = new Dana();
        
        Keuntungan didapat = new Keuntungan();
        
        //input
        System.out.println("DEG DEGAN APP");
        System.out.println("-------------------------------");
        System.out.println("Masukkan Harga Jual");
        System.out.println();
        
        System.out.print("Boyolali (>=9.000) : ");
        int byl = input.nextInt();
        int income_byl = didapat.untung(byl, 5000);
        int untung_byl = income_byl - krm_byl.dana_byl();
                
        System.out.print("Salatiga (>=10.000) : ");
        int slg = input.nextInt();
        int income_slg = didapat.untung(slg, 7500);
        int untung_slg = income_slg - krm_slg.dana_slg();
        
        System.out.print("Klaten (>=11.000) : ");
        int klt = input.nextInt();
        int income_klt = didapat.untung(klt, 8300);
        int untung_klt = income_klt - krm_klt.dana_klt();
        
        System.out.print("Kudus (>=12.000) : ");
        int kds = input.nextInt();
        int income_kds = didapat.untung(kds, 9100);
        int untung_kds = income_kds - krm_kds.dana_kds();
        
        System.out.println("-------------------------------");
        double untung_total = untung_byl + untung_slg + untung_klt + untung_kds;
        System.out.print("Keuntungan Total = " + untung_total);
    }
}
