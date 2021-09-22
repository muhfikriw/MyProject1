/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;


/**
 *
 * @author Fikri
 */
public class BangunRuangMain {
    public static void main(String[] args) {

        System.out.println("----Bola--");
        Bola a;
        a= new Bola();
        a.jari=7;
        a.hitungVol();
        a.hitungLuasSelimut();
        
        System.out.println("\n");
        System.out.println("----Tabung--");
        
        Tabung b;
        b= new Tabung();
        b.jari=7;
        b.tinggi=5;
        b.hitungVol();
        b.hitungLuasSelimut();
        
        System.out.println("\n");
        System.out.println("----Kerucut--");
        
        Kerucut c;
        c= new Kerucut();
        c.jari=3;
        c.tinggi=4;
        c.hitungVol();
        c.hitungLuasSelimut();
        
        
    }
}
