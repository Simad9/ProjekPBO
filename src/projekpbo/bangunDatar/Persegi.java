package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

/**
 * Kelas Persegi yang merepresentasikan bentuk bangun datar Persegi
 *
 * @author User
 */
public class Persegi extends Geometri2D {

    // Atribut khusus untuk persegi
    private final double sisi;
    private double luasPersegi;

    // Constructor untuk Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
        luasPersegi = hitungLuas();
    }

    // Implementasi metode hitungLuas() untuk persegi
    @Override
    public double hitungLuas() {
        // Rumus luas persegi: sisi * sisi
        luasPersegi = sisi * sisi;
        return luasPersegi;
    }

    // Getter untuk luasPersegi
    public double getLuasPersegi() {
        return luasPersegi;
    }
}

