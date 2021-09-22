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
public class MyProject {
    public static void main(String[] args) {
        OperasiBilangan2 bil = new OperasiBilangan2();
        bil.bilPertama = 100;
        bil.bilKedua = 150;
        bil.hitungPenjumlahan();
        bil.hitungPengurangan();
        bil.hitungPerkalian();
        bil.hitungPembagian();
    }

}
