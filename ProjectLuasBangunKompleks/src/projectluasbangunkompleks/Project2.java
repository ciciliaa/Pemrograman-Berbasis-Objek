/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author HP
 */
public class Project2 {
    public static void main (String args []) {
        
        Lingkaran b = new Lingkaran();
        b.r = 14;
        int lingkaranb = b.hitungLuas();

        Lingkaran k = new Lingkaran();
        k.r = 7;
        int lingkarank = k.hitungLuas();
        
        double LuasAbu = lingkaranb - lingkarank;
        
        System.out.println("Luas daerah abu-abu : " + LuasAbu);
        
    }
}
