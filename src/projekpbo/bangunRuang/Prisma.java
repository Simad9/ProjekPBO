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
    public double tinggiPrisma;
    public double volumePrisma;

    // Constructor untuk Prisma
    public Prisma(double alas, double tinggi, double tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    // Implementasi metode hitungVolume() untuk prisma
    @Override
    public double hitungVolume() {
        // Volume prisma segitiga = luas segitiga * tinggiPrisma
        volumePrisma = hitungLuas() * tinggiPrisma;
        return volumePrisma;
    }
}
