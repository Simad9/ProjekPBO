/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

/**
 *
 * @author User
 */
public class PersegiPanjang extends Geometri2D {
    // Atribut khusus untuk persegi panjang
    private double panjang;
    private double lebar;
    private double luasPersegiPanjang;

    // Constructor untuk PersegiPanjang
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        luasPersegiPanjang = hitungLuas();
    }

    // Implementasi metode hitungLuas() untuk persegi panjang
    @Override
    public double hitungLuas() {
        // Rumus luas persegi panjang: panjang * lebar
        luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
    }

    // Getter untuk luas Persegi Panjang
    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }
}
