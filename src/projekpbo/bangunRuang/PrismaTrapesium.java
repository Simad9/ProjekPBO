package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Trapesium;

public class PrismaTrapesium extends Trapesium {
  // Atribut khusus untuk PrismaTrapesium
  public double tinggiPrismaTrapesium;
  public double volumePrismaTrapesium;

  // Constructor untuk PrismaTrapesium
  public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium) {
    super(alasAtas, alasBawah, tinggi);
    this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
  }

  // Implementasi metode hitungVolume() untuk PrismaTrapesium
  @Override
  public double hitungVolume() {
    // Volume PrismaTrapesium = luas Trapesium * tinggi PrismaTrapesium
    volumePrismaTrapesium = hitungLuas() * tinggiPrismaTrapesium;
    return volumePrismaTrapesium;
  }
}
