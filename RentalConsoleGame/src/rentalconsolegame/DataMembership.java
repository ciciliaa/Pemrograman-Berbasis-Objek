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

import java.util.ArrayList;
public class DataMembership {
    //menyimpan data member
    ArrayList<Membership> dataMembership = new ArrayList<Membership>();
    
    //add member
    void addMembership(Membership data){
        this.dataMembership.add(data);
    }
    
    //mencari member
    void cariMembership(String id){
        boolean status = false;
        int index = 0;
        for(int i=0; i < this.dataMembership.size(); i++){
            if(this.dataMembership.get(i).idMember == id){
                index = index + i;
                status = true;
            }
        }
    
        //data ditemukan, tampil data
        if(status == true){
            System.out.println("Data Ditemukan");
            this.dataMembership.get(index).print();
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    
    }
    
    void tampilMembership(){
        for(Membership item: this.dataMembership){
            System.out.println("-------------------------------------");
            item.print();
        }
    }
}
