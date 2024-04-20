package projekpbo.bangunRuang;

import projekpbo.bangunDatar.BelahKetupat;

public class LimasSegiEmpat extends BelahKetupat {
  // Atribut khusus untuk LimasSegiEmpat
  public double tinggiLimasSegiEmpat;
  public double volumeLimasSegiEmpat;

  // Constructor untuk LimasSegiEmpat
  public LimasSegiEmpat(double diagonal1, double diagonal2, double tinggiLimasSegiEmpat) {
    super(diagonal1, diagonal2);
    this.tinggiLimasSegiEmpat = tinggiLimasSegiEmpat;
  }

  // Implementasi metode hitungVolume() untuk LimasSegiEmpat
  @Override
  public double hitungVolume() {
    // Volume LimasSegiEmpat = 1/3 * luas BelahKetupat * tinggi LimasSegiEmpat
    volumeLimasSegiEmpat = 1.0 / 3.0 * hitungLuas() * tinggiLimasSegiEmpat;
    return volumeLimasSegiEmpat;
  }
}
