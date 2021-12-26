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
public class Silver extends Membership{
    
    private int diskon = 1;
    private int poin;
    private int totalSewa;
    
    public Silver(DataMembership membership){
        super.membership = membership;
        super.setBiayaSewa(25000);
        super.inputPinjam();
    }
    
    public void hitungBiaya(){
        this.poin = 1 * lamaSewa;
        this.totalSewa = getBiayaSewa() * this.lamaSewa;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void output(){
        super.output();
        System.out.println("----------------------------------");
        System.out.println("Total Sewa      = " + this.totalSewa);
        System.out.println("Jumlah Poin     = " + this.poin);
    }
}
