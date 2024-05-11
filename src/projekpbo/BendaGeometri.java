/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

/**
 *
 * @author User
 */
public interface BendaGeometri {
    // Untuk Bangun Datar menghitung luas dan keliling
    double hitungLuas();
    double hitungKeliling();

    // Untuk Bangun Ruang menghitung volume dan luas permukaan
    double hitungVolume();
    double hitungLuasPermukaan();
}
