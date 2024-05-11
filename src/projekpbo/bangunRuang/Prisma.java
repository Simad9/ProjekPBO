/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

/**
 * Wijdan : Ini prisma segitiga kan ya?
 * @author User
 */
public class Prisma extends Segitiga {
    // Atribut khusus untuk prisma
    private double tinggiPrisma;
    private double volumePrisma;
    private double luasPermukaanPrisma;

    // Constructor untuk Prisma
    public Prisma(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
        volumePrisma = hitungVolume();
        luasPermukaanPrisma = hitungLuasPermukaan();
    }

    // Implementasi metode hitungVolume() untuk prisma
    @Override
    public double hitungVolume() {
        // Volume prisma segitiga = luas segitiga * tinggiPrisma
        volumePrisma = hitungLuas() * tinggiPrisma;
        return volumePrisma;
    }

    // Getter untuk Volume Prisma
    public double getVolumePrisma() {
        return volumePrisma;
    }
    
    // Implementasi metode hitungLuasPermukaan() untuk Prisma
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma = (2 * luas alas) + (kelilingsegitiga * tinggi)
        luasPermukaanPrisma = (2 * hitungLuas()) + (getKelilingSegitiga() * tinggiPrisma);
        return luasPermukaanPrisma;
    }
    
    public double getLuasPermukaanPrisma(){
        return luasPermukaanPrisma;
    }
}

