/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import projekpbo.bangunDatar.*;
import projekpbo.bangunRuang.*;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {

        // ======= Bangun Datar =======
        System.out.println("\n=== Bagun Datar ===");

        // Segitiga
        Segitiga segitiga = new Segitiga(5, 3);
        System.out.println("\n+ Segitiga \nalas = 5 & tinggi = 3");
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());

        // Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("\n+ Persegi \nsisi = 4");
        System.out.println("Luas Persegi : " + persegi.hitungLuas());

        // Persi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("\n+ Persegi \npanjang = 5 & lebar = 3");
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());

        // Jajar Genjang
        JajarGenjang jajarGenjang = new JajarGenjang(5, 3);
        System.out.println("\n+ Jajar Genjang \nalas = 5 & tinggi = 3");
        System.out.println("Luas Jajar Genjang : " + jajarGenjang.hitungLuas());

        // Layang-layang
        LayangLayang layangLayang = new LayangLayang(5, 3);
        System.out.println("\n+ Layang-layang \ndiagonal 1 = 5 & diagonal 2 = 3");
        System.out.println("Luas Layang-layang : " + layangLayang.hitungLuas());

        // Trapesium
        Trapesium trapesium = new Trapesium(5, 3, 2);
        System.out.println("\n+ Trapesium \nalas atas = 5 , alas bawah = 3, & tinggi = 2");
        System.out.println("Luas Trapesium : " + trapesium.hitungLuas());

        // Belah Ketupat
        BelahKetupat belahKetupat = new BelahKetupat(5, 3);
        System.out.println("\n+ Belah Ketupat \ndiagonal 1 = 5 & diagonal 2 = 3");
        System.out.println("Luas Belah Ketupat : " + belahKetupat.hitungLuas());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("\n+ Lingkaran \njari-jari = 5");
        System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());

        // Juring
        Juring juring = new Juring(5, 30);
        System.out.println("\n+ Juring \njari-jari = 5 dengan sudut = 30");
        System.out.println("Luas Juring : " + juring.hitungLuas());

        // Tembereng
        Tembereng tembereng = new Tembereng(5, 30);
        System.out.println("\n+ Tembereng \njari-jari = 5 dengan sudut = 45");
        System.out.println("Luas Tembereng : " + tembereng.hitungLuas());

        // ======= Bangun Ruang =======
        System.out.println("\n\n=== Bagun Ruang ===");
        // Prisma
        Prisma prisma = new Prisma(5, 3, 10);
        System.out.println("Volume Prisma : " + prisma.hitungVolume());

        // Limas Persegi
        LimasPersegi limasPersegi = new LimasPersegi(4, 8);
        System.out.println("Volume Limas Persegi : " + Math.round(limasPersegi.hitungVolume() * 100.0) / 100.0);

    }
}
