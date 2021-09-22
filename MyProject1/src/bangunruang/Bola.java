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
public class Bola {
    public int jari;
    public double hasil, phi=3.14285;
    
    public void hitungVol(){
        hasil = 4/3*jari*jari*jari*phi;
        System.out.println("Volume Bola : " + hasil);
    }
    public void hitungLuasSelimut(){
         hasil = 4*phi*jari*jari;
        System.out.println("Selimut Bola : " + hasil);
    }
}
