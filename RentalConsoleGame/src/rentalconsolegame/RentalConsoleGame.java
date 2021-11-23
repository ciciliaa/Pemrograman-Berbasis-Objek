/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class RentalConsoleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //add membership
        DataMembership m = new DataMembership();
        m.addMembership(new Membership("M001", "Mr.X", "Silver"));
        m.addMembership(new Membership("M002", "Mr.Y", "Gold"));
        m.addMembership(new Membership("M003", "Mr.Z", "Platinum"));
        
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                :");
        String str = input.nextLine();
        System.out.print("Masukkan Tanggal Pinjam (1-31)    :");
        int tglPjm = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)      :");
        int blnPjm = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam             :");
        int thnPjm = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31)   :");
        int tglKmbl = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)     :");
        int blnKmbl = input.nextInt();
        System.out.print("Masukkan Tahun Kembali            :");
        int thnKmbl = input.nextInt();
        
        //program output
        DataMembership n = new DataMembership();
        n.cariMembership(str);
        
    }
    
}
