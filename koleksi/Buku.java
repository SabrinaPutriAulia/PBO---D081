/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author DELL
 */
public class Buku extends Koleksi {
    private String penulis;
    
    public Buku(String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }
    
    public String toString() {
        return super.toString() + "\nPenulis: " + penulis;
    }
}
