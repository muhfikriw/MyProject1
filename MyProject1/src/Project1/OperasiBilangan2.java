/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Fikri
 */
public class OperasiBilangan2 {
        // atribut
    public int bilPertama;
    public int bilKedua;
    
    // methods
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil perkaliannya: " + hasil);
    }
    public void hitungPembagian(){
        double hasil = (double)bilPertama / bilKedua;
        System.out.println("Hasil pembagiannya: " + hasil);
    }
}
