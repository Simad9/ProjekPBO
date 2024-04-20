package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Segitiga;

public class BolaSetengahSegitiga extends Segitiga {
  // Atribut khusus untuk BolaSetengahSegitiga
  public double tinggiBolaSetengahSegitiga;
  public double volumeBolaSetengahSegitiga;

  // Constructor untuk BolaSetengahSegitiga
  public BolaSetengahSegitiga(double alas, double tinggi, double tinggiBolaSetengahSegitiga) {
    super(alas, tinggi);
    this.tinggiBolaSetengahSegitiga = tinggiBolaSetengahSegitiga;
  }

  // Implementasi metode hitungVolume() untuk BolaSetengahSegitiga
  @Override
  public double hitungVolume() {
    // Volume BolaSetengahSegitiga = 1/3 * luas Segitiga * tinggi
    // BolaSetengahSegitiga
    volumeBolaSetengahSegitiga = (1.0 / 3.0) * hitungLuas() * tinggiBolaSetengahSegitiga;
    return volumeBolaSetengahSegitiga;
  }
}
