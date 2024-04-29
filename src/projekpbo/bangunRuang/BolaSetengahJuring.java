package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Juring;

public class BolaSetengahJuring extends Juring {
  // Atribut khusus untuk BolaSetengahJuring
  private double volumeBolaSetengahJuring;

  // Constructor untuk BolaSetengahJuring
  public BolaSetengahJuring(double jariJari, double sudut) {
    super(jariJari, sudut);
    volumeBolaSetengahJuring = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk BolaSetengahJuring
  @Override
  public double hitungVolume() {
    // Volume BolaSetengahJuring = 1/3 * phi * r^3 * teta
    volumeBolaSetengahJuring = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 3) * Math.toRadians(sudut);
    return volumeBolaSetengahJuring;
  }

  // Getter untuk Volume BolaSetengahJuring
  public double getVolumeBolaSetengahJuring() {
    return volumeBolaSetengahJuring;
  }
}
