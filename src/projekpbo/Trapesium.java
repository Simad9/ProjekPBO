/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

/**
 *
 * @author User
 */
public class Trapesium extends Geometri2D {
    // Atribut khusus untuk trapesium
    public double alasAtas;
    public double alasBawah;
    public double tinggi;
    public double luasTrapesium;

    // Constructor untuk Trapesium
    public Trapesium(double alasAtas, double alasBawah, double tinggi) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungLuas() untuk trapesium
    @Override
    public double hitungLuas() {
        // Rumus luas trapesium: 0.5 * (alasAtas + alasBawah) * tinggi
        luasTrapesium = 0.5 * (alasAtas + alasBawah) * tinggi;
        return luasTrapesium;
    }
}

