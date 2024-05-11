package projekpbo.bangunRuang;

import projekpbo.bangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang {
  // Atribut khusus untuk Balok
  private double tinggiBalok;
  private double volumeBalok;
  private double luasPermukaanBalok;

  // Constructor untuk Balok
  public Balok(double panjang, double lebar, double tinggiBalok) {
    super(panjang, lebar);
    this.tinggiBalok = tinggiBalok;
    volumeBalok = hitungVolume();
    luasPermukaanBalok = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk Balok
  @Override
  public double hitungVolume() {
    // Volume Balok = luas Persegi Panjang * tinggi Balok
    volumeBalok = hitungLuas() * tinggiBalok;
    return volumeBalok;
  }

  // Getter untuk volume Balok
  public double getVolumeBalok() {
    return volumeBalok;
  }
  
  // Implementasi metode untuk menghitung luas permukaan Balok
    public double hitungLuasPermukaan() {
        // Luas Permukaan Balok = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
        luasPermukaanBalok = 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok)); 
      return luasPermukaanBalok;
    }
    
   public double getLuasPermukaanBalok(){
       return luasPermukaanBalok;
   }

}
