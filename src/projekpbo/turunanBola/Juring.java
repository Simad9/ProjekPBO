package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class Juring extends Bola {
  // Atribut khusus untuk Juring
  private double theta;
  private double luasJuring;
  private double kelilingJuring;

  // Constructor untuk Juring
  public Juring(double jariJari, double theta) {
    super(jariJari);
    this.theta = theta;
    luasJuring = hitungLuas();
    kelilingJuring = hitungKeliling();
  }

  @Override
  public double hitungLuas() {
    luasJuring = 0.5 * jariJari * jariJari * Math.toRadians(theta);
    return luasJuring;
  }

  // Getter untuk Luas Juring
  public double getLuasJuring() {
    return luasJuring;
  }

  @Override
  public double hitungKeliling() {
    kelilingJuring = jariJari * (theta + 2);
    return kelilingJuring;
  }

  public double getKelilingJuring() {
    return kelilingJuring;
  }

}

