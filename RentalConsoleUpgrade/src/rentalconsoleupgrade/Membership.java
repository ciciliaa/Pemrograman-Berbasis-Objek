/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleupgrade;

/**
 *
 * @author HP
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Membership {
    
    public DataMembership membership;
    private int biayaSewa;
    protected LocalDate tglPjm;
    protected LocalDate tglKmbl;
    protected int lamaSewa;
    ArrayList<DataMembership> DataMembership = new ArrayList<DataMembership>();
    
    void setBiayaSewa(int x){
        if(x<0){
            this.biayaSewa = 0;
            System.out.println("Masukkan Biaya Sewa Yang Benar!");
        }
        else{
            this.biayaSewa = x;
        }
    }
    
    int getBiayaSewa(){
        return this.biayaSewa;
    }
    
    public void addMembership(DataMembership data){
        this.DataMembership.add(data);
    }
    
    void cariMembership(String ID){
        boolean status = false;
        int index = -1;
        for(int i=0; i<this.DataMembership.size(); i++){
            if(this.DataMembership.get(i).ID.equals(ID)){
                index = i;
                status = true;
            }
        }
        
        if(status == true){
            this.membership = this.DataMembership.get(index);
        }
        else{
            System.out.println("Data Membership Tidak Ditemukan");
            System.exit(0);
        }
    }
    
    public DataMembership inputMembership(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                :");
        this.cariMembership(input.nextLine());
        return this.membership;
    }
    
    void inputPinjam(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)    :");
        int tglPjm = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)      :");
        int blnPjm = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam             :");
        int thnPjm = input.nextInt();
        this.tglPjm = LocalDate.of(thnPjm, blnPjm, tglPjm);
        System.out.print("Masukkan Tanggal Kembali (1-31)   :");
        int tglKmbl = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)     :");
        int blnKmbl = input.nextInt();
        System.out.print("Masukkan Tahun Kembali            :");
        int thnKmbl = input.nextInt();
        this.tglKmbl = LocalDate.of(thnKmbl, blnKmbl, tglKmbl);
        
        this.lamaSewa = (int) ChronoUnit.DAYS.between(this.tglPjm, this.tglKmbl);
        System.out.println();
        if(this.lamaSewa<0){
            System.out.println("Tanggal Pinjam Salah!");
            System.exit(0);
        }
    }
    
    protected void output(){
        this.membership.print();
        System.out.println("-------------------------------------");
        System.out.println("Tanggal Pinjam      : " + this.tglPjm);
        System.out.println("Tanggal Kembali     : " + this.tglKmbl);
        System.out.println("Lama Sewa           : " + this.lamaSewa + " hari");
        System.out.println();
    }
}
