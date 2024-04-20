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
public class Persegi extends Geometri2D {
    // Atribut khusus untuk persegi
    public double sisi;
    public double luasPersegi;

    // Constructor untuk Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode hitungLuas() untuk persegi
    @Override
    public double hitungLuas() {
        // Rumus luas persegi: sisi * sisi
        luasPersegi = sisi * sisi;
        return luasPersegi;
    }
}
