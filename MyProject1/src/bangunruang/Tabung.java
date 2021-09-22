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
public class Tabung {
    public int jari, tinggi;
    public double hasil, phi=3.14;
    
    public void hitungVol(){
        hasil = phi*jari*jari*tinggi;
        System.out.println("Volume Tabung : " + hasil);
    }
    public void hitungLuasSelimut(){
         hasil = 2*phi*jari*tinggi;
        System.out.println("Selimut Tabung : " + hasil);
    }
}
