package projekpbo.bangunRuang;

import projekpbo.bangunDatar.JajarGenjang;

public class PrismaJajarGenjang extends JajarGenjang {
  // Atribut khusus untuk PrismaJajarGenjang
  private double tinggiPrismaJajarGenjang;
  private double volumePrismaJajarGenjang;

  // Constructor untuk PrismaJajarGenjang
  public PrismaJajarGenjang(double alas, double tinggi, double tinggiPrismaJajarGenjang) {
    super(alas, tinggi);
    this.tinggiPrismaJajarGenjang = tinggiPrismaJajarGenjang;
    volumePrismaJajarGenjang = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk PrismaJajarGenjang
  @Override
  public double hitungVolume() {
    // Volume PrismaJajarGenjang = luas Jajar Genjang * tinggi PrismaJajarGenjang
    volumePrismaJajarGenjang = hitungLuas() * tinggiPrismaJajarGenjang;
    return volumePrismaJajarGenjang;
  }

  // Getter untuk Volume PrismaJajarGenjang
  public double getVolumePrismaJajarGenjang() {
    return volumePrismaJajarGenjang;
  }
}
