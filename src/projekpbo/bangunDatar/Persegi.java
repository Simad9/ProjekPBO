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
    private double kelilingPersegi;

    // Constructor untuk Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
        luasPersegi = hitungLuas();
        kelilingPersegi = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk persegi
    @Override
    public double hitungLuas() {
        // Rumus luas persegi: sisi * sisi
        luasPersegi = sisi * sisi;
        return luasPersegi;
    }

    // Getter untuk luas Persegi
    public double getLuasPersegi() {
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        kelilingPersegi = 4 * sisi;
        return kelilingPersegi;
    }

    public double getKelilingPersegi() {
        return kelilingPersegi;
    }

}
