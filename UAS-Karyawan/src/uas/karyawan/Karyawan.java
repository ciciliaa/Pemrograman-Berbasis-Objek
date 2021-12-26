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

public class Karyawan {
    
    public void tambahData (ArrayList<String> array){
        Scanner input = new Scanner (System.in);
        System.out.print("");
        System.out.print("Masukkan Kode Karyawan \t\t: ");
        String kode = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan Nama Karyawan \t\t: ");
        String nama = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan golongan (a/b/c/d) \t: ");
        String gol = input.nextLine();
        gol = gol.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan usia \t\t\t: ");
        String usia = input.nextLine();
        System.out.print("");
        System.out.print("Masukkan status menikah (sdh/blm) \t: ");
        String status = input.nextLine();
        status = status.toLowerCase();
        System.out.print("");
        System.out.print("Masukkan jumlah anak \t\t: ");
        String jumlah_anak = input.nextLine();
        
        array.add(kode);
        array.add(nama);
        array.add(gol);
        array.add(usia);
        array.add(status);
        array.add(jumlah_anak); 
    }
    
    public void hapusData (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (!array.get(i).equals(kode)){
                System.out.println("Data karyawan tidak ada");
            } else {
                array.remove(i);
                array.remove(i + 1);
                array.remove(i + 2);
                array.remove(i + 3);
                array.remove(i + 4);
                array.remove(i + 5);
                status = true;
            }
        }
    }
    
    public void cariData (ArrayList<String> array, String kode){
        boolean status = false;
        int j = array.size();
        for(int i=0; i<j; i++){
            if (array.get(i).equals(kode)){
                double gaji_kotor = 0;
                double gaji_bersih = 0;        
                double tunjangan_istri_suami = 0;
                double tunjangan_anak = 0;
                double tunjangan_pegawai = 0;
                System.out.println("=====================");
                System.out.println("DATA KARYAWAN");
                System.out.println("---------------------");
                System.out.println("KODE KARYAWAN \t: "+ array.get(i));
                System.out.println("NAMA KARYAWAN \t: "+ array.get(i+1));
                System.out.println("GOLONGAN \t: "+ array.get(i+4));
                System.out.println("USIA \t\t: "+ array.get(i+3));
                System.out.print("STATUS MENIKAH \t: ");
                if ("y".equals(array.get(i+5))){
                    System.out.println("MENIKAH");
                    System.out.print("");
                } else {
                    System.out.println("BELUM MENIKAH");
                    System.out.print("");
                }
                if (null == array.get(i+4)){
                    System.out.println("ERROR");
                }
                else switch (array.get(i+4)) {
                    case "a":
                        System.out.println("GAJI \t\t: Rp5000000");
                        System.out.print("TUNJANGAN ISTRI/SUAMI \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp500000");
                            tunjangan_istri_suami = 500000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp750000");
                                tunjangan_pegawai = 750000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (250000 * anak));
                                tunjangan_anak = 250000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  
                        
                        System.out.println("----------------------------------- +");
                        gaji_kotor = 5000000 + tunjangan_istri_suami + tunjangan_pegawai + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("----------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    case "b":
                        System.out.println("GAJI \t\t: Rp6000000");
                        System.out.print("TUNJANGAN ISTRI/SUAMI \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp600000");
                            tunjangan_istri_suami = 600000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp900000");
                                tunjangan_pegawai = 900000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (300000 * anak));
                                tunjangan_anak = 300000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  
                        System.out.println("--------------------------------- +");
                        gaji_kotor = 6000000 + tunjangan_istri_suami + tunjangan_pegawai +  + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("--------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    case "c":
                        System.out.println("GAJI \t\t: Rp7000000");
                        System.out.print("TUNJANGAN MENIKAH \t: ");
                        if ("y".equals(array.get(i+5))){
                            System.out.println("Rp700000");
                            tunjangan_istri_suami = 700000 ;
                        } else {
                            System.out.println("0");
                        }  System.out.print("TUNJANGAN PEGAWAI \t: ");
                        try {
                            int usia = Integer.parseInt(array.get(i+3));
                            if (usia > 30){
                                System.out.println("Rp1050000");
                                tunjangan_pegawai = 1050000;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  System.out.print("TUNJANGAN ANAK \t\t: ");
                        try {
                            int anak = Integer.parseInt(array.get(i+6));
                            if (anak >= 0){
                                System.out.println("Rp"+ (350000 * anak));
                                tunjangan_anak = 350000 * anak;
                            }  else {
                                System.out.println("0");
                            }
                        } catch (Exception e){
                            System.out.print("ERROR");
                        }  
                        System.out.println("----------------------------------- +");
                        gaji_kotor = 7000000 + tunjangan_istri_suami + tunjangan_pegawai + tunjangan_anak ;
                        System.out.println("GAJI KOTOR \t: Rp"+ gaji_kotor);
                        System.out.println("POTONGAN \t: Rp" + (gaji_kotor * 0.025));
                        gaji_bersih = gaji_kotor - (gaji_kotor * 0.025);
                        System.out.println("----------------------------------- -");
                        System.out.println("GAJI BERSIH \t: "+ gaji_bersih);
                        status = true;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
            }
        }
    }
    
    public void tampilData(ArrayList<String> array) {
        boolean status = false;
        int batas = 6;
        int j = array.size();
        System.out.println("=========================");
        System.out.println("DATA KARYAWAN");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("KODE KARY \t NAMA KARY \t GOL \t USIA \t STATUS NIKAH \t JUMLAH ANAK");
        System.out.println("------------------------------------------------------------------------------------");
        for(int i=0; i<j; i++){
            if (i % batas == 0){
                System.out.println(array.get(i)+ "\t");
            } else {
                System.out.print(array.get(i)+"\t");
            }
        }
    }
}
