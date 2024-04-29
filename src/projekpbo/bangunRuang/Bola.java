package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Bola extends Lingkaran {
  // Atribut khusus untuk Bola
  private double volumeBola;

  // Constructor untuk Bola
  public Bola(double jariJari) {
    super(jariJari);
    volumeBola = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk Bola
  @Override
  public double hitungVolume() {
    // Volume Bola = 4/3 * Phi * r ^ 3
    volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3); // Menggunakan jari-jari dari kelas Lingkaran
    return volumeBola;
  }

  // Getter untuk Volume Bola
  public double getVolumeBola() {
    return volumeBola;
  }
}
