/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan12.frontend;

import com.mycompany.pertemuan12.backend.Anggota;
/**
 *
 * @author lenovo
 */
public class TestAnggota {
    public static void main(String[] args) {
        Anggota kat1 = new Anggota("Mario Welson", "Jakarta", "086457181297");
        Anggota kat2 = new Anggota("Naibaho", "Jakarta", "082254281296");
        Anggota kat3 = new Anggota("Mario", "Jakarta", "082257182595");
        Anggota kat4 = new Anggota("Welson", "Jakarta", "082257534294");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        kat4.save();

        // test update
        kat3.setAlamat("Politeknik Negeri Malang");
        kat3.save();

        // test delete
        kat4.delete();

        // test select all
        for (Anggota k : new Anggota().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }

        // test search
        for (Anggota k : new Anggota().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Alamat: " + k.getAlamat() + ", Telepon: " + k.getTelepon());
        }
    }
}
