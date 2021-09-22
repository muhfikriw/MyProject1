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
public class Kerucut {
    public int jari, tinggi;
    public double hasil,s , phi=3.14;
    
    public void hitungVol(){
        hasil = phi*jari*jari*tinggi/3;
        System.out.println("Volume Kerucut : " + hasil);
    }
    public void hitungLuasSelimut(){
        s = (int) (float) Math.sqrt( Math.pow(jari,2) + Math.pow(tinggi,2) );
        hasil = phi*jari*s;
        System.out.println("Selimut Kerucut : " + hasil);
    }
}
