package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class Juring extends Bola {
  // Atribut khusus untuk Juring
  public double jariJari;
  public double theta;
  private double luasJuring;
  private double kelilingJuring;

  // Constructor untuk Juring
  public Juring(double jariJari, double theta) {
    super(jariJari);
    this.theta = Math.toRadians(theta);
    luasJuring = hitungLuas();
    kelilingJuring = hitungKeliling();
  }

  @Override
  public double hitungLuas() {
    luasJuring = 0.5 * jariJari * jariJari * theta;
    return luasJuring;
  }

  // Getter untuk Luas Juring
  public double getLuasJuring() {
    return luasJuring;
  }

  @Override
  public double hitungKeliling() {
    // Keliling Juring = 2 * pi * r
    kelilingJuring = jariJari * (theta + 2);
    return kelilingJuring;
  }

  public double getKelilingJuring() {
    return kelilingJuring;
  }

}
