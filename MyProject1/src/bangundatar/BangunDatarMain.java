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
public class BangunDatarMain {
    public static void main(String[] args) {
        System.out.println("----Persegi Panjang--");
        PersegiPanjang bil = new PersegiPanjang();
        bil.panjang = 25;
        bil.lebar = 38;
        bil.hitungLuas();
        bil.hitungKeliling();
        System.out.println("\n");
        System.out.println("----Persegi A--");
        Persegi a;
        a= new Persegi();
        a.sisi = 10;
        a.hitungLuas();
        a.hitungKeliling();
        System.out.println("\n");
        System.out.println("----Persegi B--");
        Persegi b;
        b= new Persegi();
        b.sisi = 15;
        b.hitungLuas();
        b.hitungKeliling();
        System.out.println("\n");
        System.out.println("----Lingkaran X---");
        Lingkaran x;
        x = new Lingkaran();
        x.jari = 25;
        x.hitungLuas();
        x.hitungKeliling();
        System.out.println("\n");
        System.out.println("----Lingkaran Z---");
        
        Lingkaran z;
        z= new Lingkaran();
        z.jari = 37;
        z.hitungLuas();
        z.hitungKeliling();
    }
}
