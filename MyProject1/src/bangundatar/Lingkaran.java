/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Fikri
 */
public class Lingkaran {
    public int jari;
    public double hasil, phi=3.14;
    
    public void hitungLuas(){
        hasil = phi*jari*jari;
        System.out.println("Luas : " + hasil);
    }
    public void hitungKeliling(){
         hasil = 2*phi*jari;
        System.out.println("Keliling : " + hasil);
    }
}
