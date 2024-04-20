package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
  // Atribut khusus untuk Balok
  public double tinggiBalok;
  public double volumeBalok;

  // Constructor untuk Balok
  public Balok(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() {
    // Volume Balok = luas Persegi Panjang * tinggi Balok
    volumeBalok = hitungLuas() * tinggiBalok;
    return volumeBalok;
  }
}
