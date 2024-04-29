package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Juring extends Geometri2D {
  // Atribut khusus untuk Juring
  public double jariJari;
  public double sudut;
  private double luasJuring;

  // Constructor untuk JajarGenjang
  public Juring(double jariJari, double sudut) {
    this.jariJari = jariJari;
    this.sudut = sudut;
    luasJuring = hitungLuas();
  }

  // Implementasi metode hitungLuas() untuk jajar genjang
  @Override
  public double hitungLuas() {
    // Rumus Luas Juring: 0.5 * r^2 * teta
    luasJuring = 0.5 * Math.pow(jariJari, 2) * sudut;
    return luasJuring;
  }

  // Getter untuk Luas Juring
  public double getLuasJuring() {
    return luasJuring;
  }

  // Getter untuk jari-jari
  public double getJariJari() {
    return jariJari;
  }
}
