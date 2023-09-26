/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
/**
 *
 * @author Rangga
 */
public class Posttest1 {
    
    
    public static void main(String[] args) {
        Kendaraan DaftarKendaraan = new Kendaraan();
        DaftarKendaraan.menambahkendaraan("mobil");
        DaftarKendaraan.menambahkendaraan("motor");
        DaftarKendaraan.menambahkendaraan("sepeda");
        DaftarKendaraan.menambahkendaraan("truk");
        DaftarKendaraan.menambahkendaraan("bus");
        
        System.out.println("Daftar Kendaraan:");
        for (int i = 0; i < 5; i++){
            String Kendaraan = DaftarKendaraan.getKendaraan().get(i);
            String pemilik = "Renggo";
            String kalimat = Kendaraan + " ini milik " + pemilik;
            System.out.println((i+1)+"."+kalimat);
        }
    }
}


