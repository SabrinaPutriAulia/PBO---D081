/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author DELL
 */
public class Skripsi extends Buku {
    private String npm;
    
    public Skripsi(String  npm, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }
    
    public String toString() {
        return "NPM: " + npm + "\n" + super.toString();
    }
}
