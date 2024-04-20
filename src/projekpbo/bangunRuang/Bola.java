package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Bola extends Lingkaran {
  // Atribut khusus untuk Bola
  public double volumeBola;

  // Constructor untuk Bola
  public Bola(double jariJari) {
    super(jariJari);
  }

  // Implementasi metode hitungVolume() untuk Bola
  @Override
  public double hitungVolume() {
    // Volume Bola = 4/3 * Phi * r ^ 3
    double volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3); // Menggunakan jari-jari dari kelas Lingkaran
    return volumeBola;
  }
}
