/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;

/**
 * Wijdan : Ini bisa disebut sebagai Limas Segiempat juga
 *
 * @author User
 */
public class LimasPersegi extends Persegi {

    // Atribut khusus untuk limas persegi
    private final double tinggiLimas;
    private double volumeLimas;

    // Constructor untuk LimasPersegi
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }

    // Implementasi metode hitungVolume() untuk limas persegi
    @Override
    public double hitungVolume() {
        // Volume limas persegi = (1/3) * luas alas * tinggiLimas
        volumeLimas = (1.0 / 3.0) * hitungLuas() * tinggiLimas;
        return volumeLimas;
    }

    // Getter untuk volumeLimas
    public double getVolumeLimas() {
        return volumeLimas;
    }
}

