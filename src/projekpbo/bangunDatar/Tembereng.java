package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Tembereng extends Geometri2D {
  // Atribut khusus untuk Tembereng
  public double jariJari;
  public double sudut;
  public double luasTembereng;

  // Constructor untuk JajarGenjang
  public Tembereng(double jariJari, double sudut) {
    this.jariJari = jariJari;
    this.sudut = sudut;
  }

  // Implementasi metode hitungLuas() untuk jajar genjang
  @Override
  public double hitungLuas() {
    // Rumus Luas Tembereng: 0.5 * r^2 * (teta - sin teta)
    luasTembereng = 0.5 * Math.pow(jariJari, 2) * (sudut - Math.sin(Math.toRadians(sudut)));
    return luasTembereng;
  }
}
