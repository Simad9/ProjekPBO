package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;

public class Kubus extends Persegi {
  // Atribut khusus untuk Kubus
  public double tinggiKubus;
  public double volumeKubus;

  // Constructor untuk Kubus
  public Kubus(double sisi, double tinggiKubus) {
    super(sisi);
    this.tinggiKubus = tinggiKubus;
  }

  // Implementasi metode hitungVolume() untuk Kubus
  @Override
  public double hitungVolume() {
    // Volume Kubus = luas Persegi * tinggi Kubus
    volumeKubus = hitungLuas() * tinggiKubus;
    return volumeKubus;
  }
}
