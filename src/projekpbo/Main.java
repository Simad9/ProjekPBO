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
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());

        // Persegi
        Persegi persegi = new Persegi(4);
        System.out.println("Luas Persegi : " + persegi.hitungLuas());

        // Prisma
        Prisma prisma = new Prisma(5, 3, 10);
        System.out.println("Volume Prisma : " + prisma.hitungVolume());

        // Limas Persegi
        LimasPersegi limasPersegi = new LimasPersegi(4, 8);
        System.out.println("Volume Limas Persegi : " + limasPersegi.hitungVolume());
        
        //Persi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());
        
        //Jajar Genjang
        JajarGenjang jajarGenjang = new JajarGenjang(5,3);
        System.out.println("Luas Jajar Genjang : " + jajarGenjang.hitungLuas());
        
        //Layang-layang
        LayangLayang layangLayang = new LayangLayang(5, 3);
        System.out.println("Luas Layang-layang : " + layangLayang.hitungLuas());
        
        //Trapesium
        Trapesium trapesium = new Trapesium(5, 3, 2);
        System.out.println("Luas Trapesium : " + trapesium.hitungLuas());
        
        //Belah Ketupat
        BelahKetupat belahKetupat = new BelahKetupat(5, 3);
        System.out.println("Luas Belah Ketupat : " + belahKetupat.hitungLuas());
        
        //Lingkaran
        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());
        
    }
}

