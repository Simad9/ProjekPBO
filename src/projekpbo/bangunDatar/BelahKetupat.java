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
public class BelahKetupat extends Geometri2D {
    // Atribut khusus untuk belah ketupat
    private double diagonal1;
    private double diagonal2;
    private double luasBelahKetupat;

    // Constructor untuk BelahKetupat
    public BelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        luasBelahKetupat = hitungLuas(); //naruhkan metode hitungLuas()
    }

    // Implementasi metode hitungLuas() untuk belah ketupat
    @Override
    public double hitungLuas() {
        // Rumus luas belah ketupat: 0.5 * diagonal1 * diagonal2
        luasBelahKetupat = 0.5 * diagonal1 * diagonal2;
        return luasBelahKetupat;
    }

    // Getter untuk Luas Belah Ketupat
    public double getLuasBelahKetupat(){
        return luasBelahKetupat;
    }
}
