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
public class DataMembership {
    
    String ID;
    String Nama;
    String Jenis;
    
    DataMembership(String ID, String Nama, String Jenis){
        this.ID = ID;
        this.Nama = Nama;
        this.Jenis = Jenis;
    }
    
    void print(){
        System.out.println("-----------------------------------------");
        System.out.println("ID Member    = " + this.ID);
        System.out.println("Nama Member  = " + this.Nama);
        System.out.println("Jenis Member = " + this.Jenis);
        System.out.println();
    }
    
}
