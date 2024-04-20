package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

public class PrismaSegitiga extends Segitiga{
    // Atribut khusus untuk PrismaSegitiga
    public double tinggiPrismaSegitiga;
    public double volumePrismaSegitiga;
  
    // Constructor untuk PrismaSegitiga
    public PrismaSegitiga(double alas, double tinggi, double tinggiPrismaSegitiga) {
      super(alas, tinggi);
      this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
    }
  
    // Implementasi metode hitungVolume() untuk PrismaSegitiga
    @Override
    public double hitungVolume() {
      // Volume PrismaSegitiga = 1/2 * luas Segitiga * tinggi PrismaSegitiga
      volumePrismaSegitiga = 1/2 * hitungLuas() * tinggiPrismaSegitiga;
      return volumePrismaSegitiga;
    }
}
