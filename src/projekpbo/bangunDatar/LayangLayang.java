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
public class LayangLayang extends Geometri2D {
    // Atribut khusus untuk layang-layang
    private double diagonal1;
    private double diagonal2;
    private double luasLayangLayang;

    // Constructor untuk LayangLayang
    public LayangLayang(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        luasLayangLayang = hitungLuas();
    }

    // Implementasi metode hitungLuas() untuk layang-layang
    @Override
    public double hitungLuas() {
        // Rumus luas layang-layang: 0.5 * diagonal1 * diagonal2
        luasLayangLayang = 0.5 * diagonal1 * diagonal2;
        return luasLayangLayang;
    }

    // Getter untuk Luas Layang Layang
    public double getLuasLayangLayang() {
        return luasLayangLayang;
    }
}
