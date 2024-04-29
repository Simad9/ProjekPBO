package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {
  // Atribut khusus untuk Kerucut
  public double tinggiKerucut;
  public double volumeKerucut;

  // Constructor untuk Kerucut
  public Kerucut(double jariJari, double tinggiKerucut) {
    super(jariJari);
    this.tinggiKerucut = tinggiKerucut;
  }

  // Implementasi metode hitungVolume() untuk Kerucut
  @Override
  public double hitungVolume() {
    // Volume Kerucut = 1/3 * luas Lingkaran * tinggi Kerucut
    volumeKerucut = (1.0 / 3.0) * hitungLuas() * tinggiKerucut;
    return volumeKerucut;
  }
}
