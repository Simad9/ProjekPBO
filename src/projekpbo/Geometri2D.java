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
public abstract class Geometri2D implements BendaGeometri {
    // Atribut yang umum untuk benda geometri 2D
    // Dapat diubah sesuai dengan kebutuhan

    // Implementasi metode hitungVolume() untuk geometri 2D
    @Override
    public double hitungVolume() {
        return 0; // Volume benda 2D adalah nol
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }
}
