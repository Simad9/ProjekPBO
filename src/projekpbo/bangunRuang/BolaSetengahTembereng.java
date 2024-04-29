package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Tembereng;

public class BolaSetengahTembereng extends Tembereng {
  // Atribut khusus untuk BolaSetengahTembereng
  private double volumeBolaSetengahTembereng;

  // Constructor untuk BolaSetengahTembereng
  public BolaSetengahTembereng(double jariJari, double sudut) {
    super(jariJari, sudut);
    volumeBolaSetengahTembereng = hitungVolume();
  }

  // Implementasi metode hitungVolume() untuk BolaSetengahTembereng
  @Override
  public double hitungVolume() {
    // Volume BolaSetengahTembereng = (2/3) * phi * r^3 * (1 - cos teta)
    volumeBolaSetengahTembereng = (2.0 / 3.0) * Math.PI * Math.pow(jariJari, 3) * (1 - Math.cos(Math.toRadians(sudut)));
    return volumeBolaSetengahTembereng;
  }

  // Getter untuk Volume BolaSetengahTembereng
  public double getVolumeBolaSetengahTembereng() {
    return volumeBolaSetengahTembereng;
  }
}
