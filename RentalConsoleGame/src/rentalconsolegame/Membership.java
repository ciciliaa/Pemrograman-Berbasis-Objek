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

import java.util.Arrays;
public class Membership {
    
    String idMember;
    String namaMember;
    String jenisMember;
    
    Membership(String id, String nama, String jenis){
        this.idMember = id;
        this.namaMember = nama;
        this.jenisMember = jenis;
    }
    
    void print(){
        System.out.println("ID Member       :" + this.idMember);
        System.out.println("Nama Member     :" + this.namaMember);
        System.out.println("Jenis Member    :" + this.jenisMember);
    }
}
