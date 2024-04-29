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
public class JajarGenjang extends Geometri2D {
    // Atribut khusus untuk jajar genjang
    private double alas;
    private double tinggi;
    private double luasJajarGenjang;

    // Constructor untuk JajarGenjang
    public JajarGenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        luasJajarGenjang = hitungLuas();
    }

    // Implementasi metode hitungLuas() untuk jajar genjang
    @Override
    public double hitungLuas() {
        // Rumus luas jajar genjang: alas * tinggi
        luasJajarGenjang = alas * tinggi;
        return luasJajarGenjang;
    }
    // Getter untuk Luas Jajar Genjang
    public double getLuasJajarGenjang() {
        return luasJajarGenjang;
    }
}
