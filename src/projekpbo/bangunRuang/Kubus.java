package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;

public class Kubus extends Persegi {
    // Atribut khusus untuk Kubus
    private final double tinggiKubus;
    private double volumeKubus;
    private double luasPermukaanKubus;

    // Constructor untuk Kubus
    public Kubus(double sisi, double tinggiKubus) {
        super(sisi);
        this.tinggiKubus = tinggiKubus;
        volumeKubus = hitungVolume();
        luasPermukaanKubus = hitungLuasPermukaan();
    }

    // Implementasi metode hitungVolume() untuk Kubus
    @Override
    public double hitungVolume() {
        // Volume Kubus = luas Persegi * tinggi Kubus
        volumeKubus = getLuasPersegi() * tinggiKubus;
        return volumeKubus;
    }

    // Getter untuk Volume Kubus
    public double getVolumeKubus() {
        return volumeKubus;
    }
    
    // Implementasi metode hitungLuasPermukaan() untuk Kubus
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Kubus = 6 * (luas persegi)
        luasPermukaanKubus =  6 * getLuasPersegi();
        return luasPermukaanKubus;
    }
    
    public double getLuasPermukaanKubus(){
        return luasPermukaanKubus;
    }

}
