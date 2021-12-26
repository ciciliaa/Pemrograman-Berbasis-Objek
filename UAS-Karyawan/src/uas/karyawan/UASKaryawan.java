/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.karyawan;

/**
 *
 * @author HP
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UASKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> karyawan = new ArrayList<String>();
        Scanner input = new Scanner (System.in);
        Karyawan opsi = new Karyawan();
            System.out.println("Menu Utama: ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Masukkan nomor pilihan : ");
            int pilihan = input.nextInt();
            System.out.print("");
            switch (pilihan) {
                case 1:
                    opsi.tambahData(karyawan);
                    break;
                case 2:
                    System.out.print("Masukkan kode karyawan yang ingin dihapus : ");
                    String kode = input.next();
                    opsi.hapusData(karyawan, kode);
                    break;
                case 3:
                    System.out.print("Masukkan kode karyawan yang ingin dicari : ");
                    String kode1 = input.next();
                    opsi.cariData(karyawan, kode1);
                    break;
                case 4:
                    opsi.tampilData(karyawan);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.exit(0);
            }
        
    }
    
}
