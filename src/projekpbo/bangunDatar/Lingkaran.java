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
public class Lingkaran extends Geometri2D {
    // Atribut khusus untuk lingkaran
    public double jariJari;
    private double luasLingkaran;

    // Constructor untuk Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        luasLingkaran = hitungLuas();
    }

    // Implementasi metode hitungLuas() untuk lingkaran
    @Override
    public double hitungLuas() {
        // Rumus luas lingkaran: pi * jari-jari^2
        luasLingkaran = Math.PI * jariJari * jariJari;
        return luasLingkaran;
    }

    // Getter untuk Luas Lingkaran
    public double getLuasLingkaran() {
        return luasLingkaran;
    }
}
