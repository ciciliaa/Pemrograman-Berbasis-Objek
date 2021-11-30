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
public class RentalConsoleUpgrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Membership m = new Membership();
        
        m.addMembership(new DataMembership("M003", "Mr.Z", "Platinum"));
        m.addMembership(new DataMembership("M002", "Mr.Y", "Gold"));
        m.addMembership(new DataMembership("M003", "Mr.Z", "Platinum"));

        DataMembership member = m.inputMembership();
        switch(member.Jenis){
            case "Silver":
                Silver silver = new Silver(member);
                silver.hitungBiaya();
                silver.output();
                break;
            case "Gold":
                Gold gold = new Gold(member);
                gold.hitungBiaya();
                gold.output();
                break;
            case "Platinum":
                Platinum platinum = new Platinum(member);
                platinum.hitungBiaya();
                platinum.output();
                break;
        }
    }
}
