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
        try {
            Segitiga segitiga = new Segitiga(5, 3);
            System.out.println("\n+ Segitiga \nalas = 5 & tinggi = 3");
            System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Segitiga tidak bisa dibuat dengan nilai alas dan tinggi yang sama.");
        }

        // Persegi
        try {
            Persegi persegi = new Persegi(4);
            System.out.println("\n+ Persegi \nsisi = 4");
            System.out.println("Luas Persegi : " + persegi.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Persegi tidak bisa dibuat dengan nilai sisi yang kurang dari 0.");
        }

        // Persi Panjang
        try {
            PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
            System.out.println("\n+ Persegi \npanjang = 5 & lebar = 3");
            System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Persegi Panjang tidak bisa dibuat dengan nilai panjang dan lebar yang kurang dari 0.");
        }

        // Jajar Genjang
        try {
            JajarGenjang jajarGenjang = new JajarGenjang(5, 3);
            System.out.println("\n+ Jajar Genjang \nalas = 5 & tinggi = 3");
            System.out.println("Luas Jajar Genjang : " + jajarGenjang.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Jajar Genjang tidak bisa dibuat dengan nilai alas dan tinggi yang sama.");
        }

        // Layang-layang
        try {
            LayangLayang layangLayang = new LayangLayang(5, 3);
            System.out.println("\n+ Layang-layang \ndiagonal 1 = 5 & diagonal 2 = 3");
            System.out.println("Luas Layang-layang : " + layangLayang.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Layang-layang tidak bisa dibuat dengan nilai diagonal yang sama.");
        }

        // Trapesium
        try {
            Trapesium trapesium = new Trapesium(5, 3, 2);
            System.out.println("\n+ Trapesium \nalas atas = 5 , alas bawah = 3, & tinggi = 2");
            System.out.println("Luas Trapesium : " + trapesium.hitungLuas());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Trapesium tidak bisa dibuat dengan nilai alas bawah dan tinggi yang kurang dari 0.");
        }

        // Belah Ketupat
        try {
            BelahKetupat belahKetupat = new BelahKetupat(5, 3);
            System.out.println("\n+ Belah Ketupat \ndiagonal 1 = 5 & diagonal 2 = 3");
            System.out.println("Luas Belah Ketupat : " + belahKetupat.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Belah Ketupat tidak bisa dibuat dengan nilai diagonal yang kurang dari 0.");
        }

        // Lingkaran
        try {
            Lingkaran lingkaran = new Lingkaran(5);
            System.out.println("\n+ Lingkaran \njari-jari = 5");
            System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Lingkaran tidak bisa dibuat dengan nilai jari-jari yang kurang dari 0.");
        }

        // Juring
        try {
            Juring juring = new Juring(5, 30);
            System.out.println("\n+ Juring \njari-jari = 5 dengan sudut = 30");
            System.out.println("Luas Juring : " + juring.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Juring tidak bisa dibuat dengan nilai jari-jari yang kurang dari 0.");
        }

        // Tembereng
        try {
            Tembereng tembereng = new Tembereng(5, 30);
            System.out.println("\n+ Tembereng \njari-jari = 5 dengan sudut = 45");
            System.out.println("Luas Tembereng : " + tembereng.hitungLuas());
        } catch (Exception e) {
            System.out.println("Maaf, Tembereng tidak bisa dibuat dengan nilai jari-jari atau sudut yang tidak valid.");
        }

        // ======= Bangun Ruang =======
        System.out.println("\n\n=== Bagun Ruang ===");
        // Segitiga --> Prisma Segitiga dan Bola Setengah Segitiga
        try {
            System.out.println("\n+Turunan Segitiga");
            System.out.println(
                    "Prisma Segitiga & Bola Setengah Lingkaran \nalas segitiga = 5, tinggi segitiga = 3, tinggi = 10");
            PrismaSegitiga prismaSegitiga = new PrismaSegitiga(5, 3, 10);
            BolaSetengahSegitiga bolsetSegitiga = new BolaSetengahSegitiga(5, 3, 10);
            System.out.println("Volume PrismaSegitiga : " + prismaSegitiga.hitungVolume());
            System.out.println("Volume BolaSetengahSegitiga : " + bolsetSegitiga.hitungVolume());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat turunan Segitiga dengan nilai yang diberikan.");
        }

        // Persegi --> Kubus
        try {
            System.out.println("\n+Turunan Persegi");
            System.out.println("Kubus \nalas sisi = 5, tinggi = 5");
            Kubus kubus = new Kubus(5, 5);
            System.out.println("Volume Kubus : " + kubus.getVolumeKubus());
        } catch (Exception e) {
            System.out.println("Maaf, Kubus tidak bisa dibuat dengan nilai sisi yang tidak valid.");
        }

        // Persegi Panjang --> Balok
        try {
            System.out.println("\n+Turunan Persegi Panjang");
            System.out.println("Balok \npanjang persegi lebar = 5, lebar persegi panjang = 10, tinggi = 10");
            Balok balok = new Balok(10, 5, 10);
            System.out.println("Volume Balok : " + balok.hitungVolume());
        } catch (Exception e) {
            System.out.println("Maaf, Balok tidak bisa dibuat dengan nilai yang tidak valid.");
        }

        // Layang-layang --> Limas Segi Empat
        try {
            System.out.println("\n+Turunan Layang-Layang");
            System.out.println("Limas Segi Empat \ndiagonal 1 = 5, diagonal 2 = 10, tinggi = 10");
            LimasSegiEmpat limasSegiEmpatL = new LimasSegiEmpat(5, 10, 10);
            System.out.println("Volume Limas Segi Empat : " + limasSegiEmpatL.hitungVolume());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Limas Segi Empat tidak bisa dibuat dengan nilai diagonal atau tinggi yang tidak valid.");
        }

        // Belah Ketupat --> Limas Segi Empat
        try {
            System.out.println("\n+Turunan Belah Ketupat");
            System.out.println("Limas Segi Empat \ndiagonal 1 = 10, diagonal 2 = 10, tinggi = 10");
            LimasSegiEmpat limasSegiEmpatB = new LimasSegiEmpat(10, 10, 10);
            System.out.println("Volume Limas Segi Empat : " + limasSegiEmpatB.hitungVolume());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Limas Segi Empat tidak bisa dibuat dengan nilai diagonal atau tinggi yang tidak valid.");
        }

        // Jajar Genjang --> Prisma Jajar Genjang dan Bola Setengah Jajar Genjang
        try {
            System.out.println("\n+Turunan Jajar Genjang");
            System.out.println(
                    "Prisma Jajar Genjang & Bola Setengah Jajar Genjang \nalas segitiga = 5, tinggi segitiga = 3, tinggi = 10");
            PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(5, 3, 10);
            BolaSetengahJajarGenjang bolasetJajarGenjang = new BolaSetengahJajarGenjang(5, 3, 10);
            System.out.println("Volume PrismaJajarGenjang : " + prismaJajarGenjang.hitungVolume());
            System.out.println("Volume BolaSetengahJajarGenjang : " + bolasetJajarGenjang.hitungVolume());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat turunan Jajar Genjang dengan nilai yang diberikan.");
        }

        // Trapesium --> Prisma Trapesium
        try {
            System.out.println("\n+Turunan Trapesium");
            System.out.println("Prisma Trapesium \nalas atas = 5, alas bawah = 5, tinggi trapesium 10, tinggi = 10");
            PrismaTrapesium prismaTrepesium = new PrismaTrapesium(5, 8, 10, 10);
            System.out.println("Volume Limas Segi Empat : " + prismaTrepesium.hitungVolume());
        } catch (Exception e) {
            System.out.println("Maaf, Prisma Trapesium tidak bisa dibuat dengan nilai yang tidak valid.");
        }

        // Lingkaran --> Silinder/Tabung, Kerucut, dan Bola
        try {
            System.out.println("\n+Turunan Lingkaran");
            System.out.println(
                    "Silinder/Tabung, Kerucut & Bola \njari-jari = 5, tinggi = 10");
            Silinder silinder = new Silinder(5, 10);
            Kerucut kerucut = new Kerucut(5, 10);
            Bola bola = new Bola(5);
            System.out.println("Volume Silinder/Tabung : " + silinder.hitungVolume());
            System.out.println("Volume Keurucut : " + kerucut.hitungVolume());
            System.out.println("Volume Bola : " + bola.hitungVolume());
        } catch (Exception e) {
            System.out.println("Maaf, tidak bisa membuat turunan Lingkaran dengan nilai yang diberikan.");
        }

        // Tembereng --> Bola Setengah Tembereng
        try {
            System.out.println("\n+Turunan Tembereng");
            System.out.println("Bola Setengah Tembereng \njari-jari = 5, sudut = 45");
            BolaSetengahTembereng bolasetTembreng = new BolaSetengahTembereng(4, 45);
            System.out.println("Volume Bola Setengah Tembereng : " + bolasetTembreng.hitungVolume());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Bola Setengah Tembereng tidak bisa dibuat dengan nilai jari-jari atau sudut yang tidak valid.");
        }

        // Juring / Sekotr Lingkaran --> Bola Setengah Juring
        try {
            System.out.println("\n+Turunan Juring");
            System.out.println("Bola Setengah Juring \njari-jari = 5, sudut = 45");
            BolaSetengahJuring bolasetJuring = new BolaSetengahJuring(5, 45);
            System.out.println("Volume Bola Setengah Juring : " + bolasetJuring.hitungVolume());
        } catch (Exception e) {
            System.out.println(
                    "Maaf, Bola Setengah Juring tidak bisa dibuat dengan nilai jari-jari atau sudut yang tidak valid.");
        }
        // // Prisma
        // Prisma prisma = new Prisma(5, 3, 10);
        // System.out.println("\n\nVolume Prisma : " + prisma.hitungVolume());
        // // Limas Persegi
        // LimasPersegi limasPersegi = new LimasPersegi(4, 8);
        // System.out.println("Volume Limas Persegi : " +
        // Math.round(limasPersegi.hitungVolume() * 100.0) / 100.0);

    }
}
