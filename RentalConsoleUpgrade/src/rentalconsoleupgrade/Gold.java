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
public class Gold extends Membership{
    
    private int diskon = 2;
    private int poin;
    private int totalSewa;
    private int cashback = 5000;
    
    public Gold(DataMembership member){
        super.membership = membership;
        super.setBiayaSewa(30000);
        super.inputPinjam();
    }
    
    public void hitungBiaya(){
        this.poin = 5 * lamaSewa;
        this.totalSewa = getBiayaSewa() * this.lamaSewa;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void outout(){
        super.output();
        System.out.println("----------------------------------");
        System.out.println("Total Sewa      = " + this.totalSewa);
        System.out.println("Jumlah Poin     = " + this.poin);
        System.out.println("Jumlah Cashback = " + this.cashback);
    }
    
}
