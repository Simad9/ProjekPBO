package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Lingkaran;

public class Silinder extends Lingkaran {
  // Atribut khusus untuk Silinder
  private double tinggiSilinder;
  private double volumeSilinder;
  private double luasPermukaanSilinder;
  // Constructor untuk Silinder
  public Silinder(double jariJari, double tinggiSilinder) {
    super(jariJari);
    this.tinggiSilinder = tinggiSilinder;
    volumeSilinder = hitungVolume();
    luasPermukaanSilinder = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Silinder
  @Override
  public double hitungVolume() {
    // Volume Silinder = luas Lingkaran * tinggi Silinder
    volumeSilinder = hitungLuas() * tinggiSilinder;
    return volumeSilinder;
  }

  // Getter untuk Volume Silinder
  public double getVolumeSilinder() {
    return volumeSilinder;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Silinder
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Silinder = 2 * luas Lingkaran + keliling Lingkaran * tinggi Silinder
        luasPermukaanSilinder = 2 * hitungLuas() + hitungKeliling() * tinggiSilinder;
        return luasPermukaanSilinder;
    }
    
    public double getLuasPermukaanSilinder(){
        return luasPermukaanSilinder;
    }
}
