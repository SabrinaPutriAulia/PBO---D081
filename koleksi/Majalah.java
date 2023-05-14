/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author DELL
 */
public class Majalah extends Koleksi {
    private String edisi;
    
    public Majalah(String judul, String penerbit, int tahun, String edisi) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    public String toString(){
        return super.toString() + "\nEdisi: " + edisi;
    }
}
