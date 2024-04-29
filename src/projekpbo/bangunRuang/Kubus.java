package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;

public class Kubus extends Persegi {
    // Atribut khusus untuk Kubus
    private final double tinggiKubus;
    private double volumeKubus;

    // Constructor untuk Kubus
    public Kubus(double sisi, double tinggiKubus) {
        super(sisi);
        this.tinggiKubus = tinggiKubus;
        volumeKubus = hitungVolume();
    }

    // Implementasi metode hitungVolume() untuk Kubus
    @Override
    public double hitungVolume() {
        // Volume Kubus = luas Persegi * tinggi Kubus
        volumeKubus = getLuasPersegi() * tinggiKubus;
        return volumeKubus;
    }

    public double getVolumeKubus() {
        return volumeKubus;
    }
}
