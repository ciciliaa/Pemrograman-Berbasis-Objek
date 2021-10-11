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
public class Project1 {
    public static void main(String[] args){
       Lingkaran l = new Lingkaran();
       l.r = 21;
       int lingkaran = l.hitungLuas();
       
       Persegi p = new Persegi();
       p.s = 42;
       int persegi = l.hitungLuas();
       
       double HasilLuas = (lingkaran * 2) + persegi;
       System.out.println("Hasil luas Bangun :" + HasilLuas);
       
       
    }
}
