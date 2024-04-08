/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Segitiga
        Segitiga segitiga = new Segitiga(5, 3);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

        // Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        // Prisma
        Prisma prisma = new Prisma(5, 3, 10);
        System.out.println("Volume Prisma: " + prisma.hitungVolume());

        // Limas Persegi
        LimasPersegi limasPersegi = new LimasPersegi(4, 8);
        System.out.println("Volume Limas Persegi: " + limasPersegi.hitungVolume());
    }
}

