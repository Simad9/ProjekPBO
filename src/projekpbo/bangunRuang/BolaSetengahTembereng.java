package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Tembereng;

public class BolaSetengahTembereng extends Tembereng {
  // Atribut khusus untuk BolaSetengahTembereng
  public double tinggiBolaSetengahTembereng;
  public double volumeBolaSetengahTembereng;

  // Constructor untuk BolaSetengahTembereng
  public BolaSetengahTembereng(double jariJari, double sudut, double tinggiBolaSetengahTembereng) {
    super(jariJari, sudut);
    this.tinggiBolaSetengahTembereng = tinggiBolaSetengahTembereng;
  }

  // Implementasi metode hitungVolume() untuk BolaSetengahTembereng
  @Override
  public double hitungVolume() {
    // Volume BolaSetengahTembereng = 2/3 * phi * r^3 * (1 - cos teta)
    volumeBolaSetengahTembereng = 2 / 3 * Math.PI * Math.pow(jariJari, 3) * (1 - Math.cos(Math.toRadians(sudut)));
    return volumeBolaSetengahTembereng;
  }
}
