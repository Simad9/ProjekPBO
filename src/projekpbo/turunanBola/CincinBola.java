package projekpbo.turunanBola;

import projekpbo.bangunRuang.Bola;

public class CincinBola extends Bola {
  // Atribut khusus untuk Juring
  private double jariJariDalam; // dari Lingkaran Jarijari Dalam
  private double jarakDuaBidang; // jarak jari jari luat dan jari jari dalam
  private double volumeCincinBola;
  private double luasPermukaanCincinBola;

  // Constructor untuk Juring
  public CincinBola(double jariJari, double jariJariDalam, double jarakDuaBidang) {
    super(jariJari);
    this.jariJariDalam = jariJariDalam;
    this.jarakDuaBidang = jarakDuaBidang;
    volumeCincinBola = hitungVolume();
    luasPermukaanCincinBola = hitungLuasPermukaan();
  }

  @Override
  public double hitungVolume() {
    volumeCincinBola = Math.PI * jarakDuaBidang
        * (jariJariDalam * jariJariDalam + jariJari * jariJari + jariJariDalam * jariJari);
    return volumeCincinBola;
  }

  public double getVolumeCincinBola() {
    return volumeCincinBola;
  }

  @Override
  public double hitungLuasPermukaan() {
    luasPermukaanCincinBola = 2 * Math.PI * jariJari * jarakDuaBidang;
    return luasPermukaanCincinBola;
  }

  public double getLuasPermukaanCincinBola() {
    return luasPermukaanCincinBola;
  }

}
