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
public class Trapesium extends Geometri2D {
    // Atribut khusus untuk trapesium
    private double alasAtas;
    private double alasBawah;
    private double tinggi;
    private double luasTrapesium;
    private double kelilingTrapesium;

    // Constructor untuk Trapesium
    public Trapesium(double alasAtas, double alasBawah, double tinggi) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        luasTrapesium = hitungLuas();
        kelilingTrapesium = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk trapesium
    @Override
    public double hitungLuas() {
        // Rumus luas trapesium: 0.5 * (alasAtas + alasBawah) * tinggi
        luasTrapesium = 0.5 * (alasAtas + alasBawah) * tinggi;
        return luasTrapesium;
    }

    // Getter untuk Luas Trapesium
    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    // Implementasi metode hitungKeliling() untuk trapesium
    @Override
    public double hitungKeliling() {
        kelilingTrapesium = 2 * (alasAtas + alasBawah) + 2 * tinggi;
        return kelilingTrapesium;
    }

    // Getter untuk Keliling Trapesium
    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }

}
