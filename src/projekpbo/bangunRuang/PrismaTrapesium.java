package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Trapesium;

public class PrismaTrapesium extends Trapesium {
  // Atribut khusus untuk PrismaTrapesium
  private double tinggiPrismaTrapesium;
  private double volumePrismaTrapesium;
  private double luasPermukaanPrismaTrapesium;

  // Constructor untuk PrismaTrapesium
  public PrismaTrapesium(double alasAtas, double alasBawah, double tinggi, double tinggiPrismaTrapesium) {
    super(alasAtas, alasBawah, tinggi);
    this.tinggiPrismaTrapesium = tinggiPrismaTrapesium;
    volumePrismaTrapesium = hitungVolume();
    luasPermukaanPrismaTrapesium = hitungLuasPermukaan();
  }

  // Implementasi metode hitungVolume() untuk PrismaTrapesium
  @Override
  public double hitungVolume() {
    // Volume PrismaTrapesium = luas Trapesium * tinggi PrismaTrapesium
    volumePrismaTrapesium = hitungLuas() * tinggiPrismaTrapesium;
    return volumePrismaTrapesium;
  }

  // Getter untuk Volume PrismaTrapesium
  public double getVolumePrismaTrapesium() {
    return volumePrismaTrapesium;
  }
  
  // Implementasi metode hitungLuasPermukaan() untuk Prisma Trapesium
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan Prisma Trapesium = (2 * luas alas) + (keliling trapesium * tinggi prisma)
        luasPermukaanPrismaTrapesium = (2 * hitungLuas()) + (hitungKeliling() * tinggiPrismaTrapesium);
        return luasPermukaanPrismaTrapesium;
    }
    
    public double getLuasPermukaanPrismaTrapesium(){
        return luasPermukaanPrismaTrapesium;
    }
}
