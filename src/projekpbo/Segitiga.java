/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekpbo;

/**
 *
 * @author user
 */
public class Segitiga extends Geometri2D {
    // Atribut khusus untuk segitiga
    public double alas;
    public double tinggi;

    // Constructor untuk Segitiga
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungLuas() untuk segitiga
    @Override
    public double hitungLuas() {
        // Rumus luas segitiga: 0.5 * alas * tinggi
        return 0.5 * alas * tinggi;
    }
}


