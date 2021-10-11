/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author HP
 */
public class Segitiga {
    static double miring(double alas, double tinggi){
        return (Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi,2)));
    }
    
    double keliling(int alas, int tinggi){
        double miring = miring(alas, tinggi);
        return (miring + alas + tinggi);
    }
    
    double keliling(double alas, double tinggi){
        double miring = miring(alas, tinggi);
        return (miring + alas + tinggi);
    }
    
    double keliling(double alas, int tinggi){
        double miring = miring(alas, tinggi);
        return (miring + alas + tinggi);
    }
    
    double keliling(int alas, double tinggi){
        double miring = miring(alas, tinggi);
        return (miring + alas + tinggi);
    }
    
    double luas(int alas, int tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double luas(double alas, double tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double luas(double alas, int tinggi){
        return ((alas * tinggi) / 2);
    }
    
    double luas(int alas, double tinggi){
        return ((alas * tinggi) / 2);
    }

}
