package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

public class BolaSetengahSegitiga extends Segitiga {
  // Atribut khusus untuk BolaSetengahSegitiga
  private double tinggiBolaSetengahSegitiga;
  private double volumeBolaSetengahSegitiga;

  // Constructor untuk BolaSetengahSegitiga
  public BolaSetengahSegitiga(double alas, double tinggi, double tinggiBolaSetengahSegitiga) {
    super(alas, tinggi);
    this.tinggiBolaSetengahSegitiga = tinggiBolaSetengahSegitiga;
    volumeBolaSetengahSegitiga = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk BolaSetengahSegitiga
  @Override
  public double hitungVolume() {
    // Volume BolaSetengahSegitiga = 1/3 * luas Segitiga * tinggi
    // BolaSetengahSegitiga
    volumeBolaSetengahSegitiga = (1.0 / 3.0) * hitungLuas() * tinggiBolaSetengahSegitiga;
    return volumeBolaSetengahSegitiga;
  }

  // Getter untuk Volume BolaSetengahSegitiga
  public double getVolumeBolaSetengahSegitiga() {
    return volumeBolaSetengahSegitiga;
  }
}
