package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

public class PrismaSegitiga extends Segitiga {
  // Atribut khusus untuk PrismaSegitiga
  private double tinggiPrismaSegitiga;
  private double volumePrismaSegitiga;

  // Constructor untuk PrismaSegitiga
  public PrismaSegitiga(double alas, double tinggi, double tinggiPrismaSegitiga) {
    super(alas, tinggi);
    this.tinggiPrismaSegitiga = tinggiPrismaSegitiga;
    volumePrismaSegitiga = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk PrismaSegitiga
  @Override
  public double hitungVolume() {
    // Volume PrismaSegitiga = 0.5 * luas Segitiga * tinggi PrismaSegitiga
    volumePrismaSegitiga = 0.5 * hitungLuas() * tinggiPrismaSegitiga;
    return volumePrismaSegitiga;
  }

  // Getter untuk Volume PrismaSegitiga
  public double getVolumePrismaSegitiga() {
    return volumePrismaSegitiga;
  }
}
