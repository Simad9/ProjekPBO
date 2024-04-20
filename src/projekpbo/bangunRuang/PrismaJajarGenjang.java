package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {
  // Atribut khusus untuk PrismaJajarGenjang
  public double tinggiPrismaJajarGenjang;
  public double volumePrismaJajarGenjang;

  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(double alas, double tinggi, double tinggiPrismaJajarGenjang) {
    super(alas, tinggi);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = luas Jajar Genjang * tinggi PrismaJajarGenjang
    volumePrismaJajarGenjang = hitungLuas() * tinggiPrismaJajarGenjang;
    return volumePrismaJajarGenjang;
  }
}
