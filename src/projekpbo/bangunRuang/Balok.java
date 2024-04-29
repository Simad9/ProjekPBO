package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
  // Atribut khusus untuk Balok
  private double tinggiBalok;
  private double volumeBalok;

  // Constructor untuk Balok
  public Balok(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
    volumeBalok = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() {
    // Volume Balok = luas Persegi Panjang * tinggi Balok
    volumeBalok = hitungLuas() * tinggiBalok;
    return volumeBalok;
  }

  // Getter untuk volume Balok
  public double getVolumeBalok() {
    return volumeBalok;
  }

}
