package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class BolaSetengahJajarGenjang extends JajarGenjang {
  // Atribut khusus untuk PrismaJajarGenjang
  public double tinggiPrismaJajarGenjang;
  public double volumePrismaJajarGenjang;

  // Constructor untuk PrismaJajarGenjang
  public BolaSetengahJajarGenjang(double alas, double tinggi, double tinggiPrismaJajarGenjang) {
    super(alas, tinggi);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = 2/3 * luas Jajar Genjang * tinggi
    // PrismaJajarGenjang
    volumePrismaJajarGenjang = (2.0 / 3.0) * hitungLuas() * tinggiPrismaJajarGenjang;
    return volumePrismaJajarGenjang;
  }
}
