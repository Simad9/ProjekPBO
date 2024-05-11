package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class Tembereng extends Bola {
  // Atribut khusus untuk Tembereng
  public double jariJari;
  public double theta;
  private double luasTembereng;
  private double kelilingTembereng;

  // Constructor untuk Tembereng
  public Tembereng(double jariJari, double theta) {
    super(jariJari);
    this.theta = Math.toRadians(theta);
    luasTembereng = hitungLuas();
    kelilingTembereng = hitungKeliling();
  }

  // Implementasi metode hitungLuas() untuk Tembereng
  @Override
  public double hitungLuas() {
    luasTembereng = 0.5 * jariJari * jariJari * (theta - Math.sin(theta));
    return luasTembereng;
  }

  // Getter untuk Luas Tembereng
  public double getLuasTembereng() {
    return luasTembereng;
  }

  // Implementasi metode hitungKeliling() untuk Tembereng
  @Override
  public double hitungKeliling() {
    double kelilingTembereng = jariJari * (theta + 2);
    return kelilingTembereng;
  }

  public double getKelilingTembereng() {
    return kelilingTembereng;
  }

}
