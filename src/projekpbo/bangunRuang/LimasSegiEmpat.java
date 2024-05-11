package projekpbo.bangunRuang;

import projekpbo.bangunDatar.BelahKetupat;

public class LimasSegiEmpat extends BelahKetupat {
  // Atribut khusus untuk LimasSegiEmpat
  private double tinggiLimasSegiEmpat;
  private double volumeLimasSegiEmpat;

  // Constructor untuk LimasSegiEmpat
  public LimasSegiEmpat(double diagonal1, double tinggiLimasSegiEmpat) {
    super(diagonal1);
    this.tinggiLimasSegiEmpat = tinggiLimasSegiEmpat;
    volumeLimasSegiEmpat = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk LimasSegiEmpat
  @Override
  public double hitungVolume() {
    // Volume LimasSegiEmpat = 1/3 * luas BelahKetupat * tinggi LimasSegiEmpat
    volumeLimasSegiEmpat = 1.0 / 3.0 * hitungLuas() * tinggiLimasSegiEmpat;
    return volumeLimasSegiEmpat;
  }

  // Getter untuk Volume LimasSegiEmpat
  public double getVolumeLimasSegiEmpat() {
    return volumeLimasSegiEmpat;
  }
}
