/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan59.detectiveconan;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Detektif Conan
 */
public class Tokoh extends Keahlian{
    private int keahlian;
    
    public Tokoh() {
        super();
    }

    public int getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(int keahlian) {
        this.keahlian = keahlian;
    }
    
    public void tampilKeahlian(int keahlian) {
        System.out.println(getNamaKeahlian(keahlian) + " : ");
        
        if(keahlian <= 5) {
            System.out.println(getKeahlian(keahlian));
        } else {
            super.tampilKeahlian();
        }
    }
}
