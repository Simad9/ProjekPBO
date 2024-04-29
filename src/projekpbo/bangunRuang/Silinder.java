package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Silinder extends Lingkaran {
  // Atribut khusus untuk Silinder
  private double tinggiSilinder;
  private double volumeSilinder;

  // Constructor untuk Silinder
  public Silinder(double jariJari, double tinggiSilinder) {
    super(jariJari);
    this.tinggiSilinder = tinggiSilinder;
    volumeSilinder = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk Silinder
  @Override
  public double hitungVolume() {
    // Volume Silinder = luas Lingkaran * tinggi Silinder
    volumeSilinder = hitungLuas() * tinggiSilinder;
    return volumeSilinder;
  }

  // Getter untuk Volume Silinder
  public double getVolumeSilinder() {
    return volumeSilinder;
  }
}
