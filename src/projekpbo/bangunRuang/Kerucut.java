package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Kerucut extends Lingkaran {
  // Atribut khusus untuk Kerucut
  private double tinggiKerucut;
  private double volumeKerucut;
  private double luasPermukaanKerucut;

  // Constructor untuk Kerucut
  public Kerucut(double jariJari, double tinggiKerucut) {
    super(jariJari);
    this.tinggiKerucut = tinggiKerucut;
    volumeKerucut = hitungVolume();
    luasPermukaanKerucut = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Kerucut
  @Override
  public double hitungVolume() {
    // Volume Kerucut = 1/3 * luas Lingkaran * tinggi Kerucut
    volumeKerucut = (1.0 / 3.0) * hitungLuas() * tinggiKerucut;
    return volumeKerucut;
  }

  // Getter untuk Volume Kerucut
  public double getVolumeKerucut() {
    return volumeKerucut;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Kerucut
  @Override
  public double hitungLuasPermukaan() {
    // Luas Permukaan Kerucut = luas alas + luas selimut
    luasPermukaanKerucut =  hitungLuas() + (Math.PI * jariJari * Math.sqrt(Math.pow(tinggiKerucut, 2) + Math.pow(jariJari, 2)));
    return luasPermukaanKerucut;
  }
  
  public double getLuasPermukaanKerucut(){
    return luasPermukaanKerucut;
  }

}
