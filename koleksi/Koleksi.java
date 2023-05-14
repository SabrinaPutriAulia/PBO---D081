/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koleksi;

/**
 *
 * @author DELL
 */
public class Koleksi {
    protected String judul;
    protected String penerbit;
    protected int tahun;
    
    public Koleksi(String judul, String penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public String toString() {
        return "Judul: " + judul + "\nPenerbit: " + penerbit + "\nTahun: " + tahun;
    }
    
    public static void main(String[] args) {
        System.out.println("======= KOLEKSI =======");
        Koleksi koleksi1 = new Koleksi("Pemrograman Java", "RH. Sianipar", 2019);
        System.out.println(koleksi1.toString());
        
        System.out.println("\n======= BUKU =======");
        Buku buku1 = new Buku("Pemrograman Java", "RH. Sianipar", "Andi Offset", 2019);
        System.out.println(buku1.toString());
        
        System.out.println("\n======= MAJALAH =======");
        Majalah majalah1 = new Majalah("Pemrograman Java", "RH. Sianipar", 2019, "Java");
        System.out.println(majalah1.toString());
        
        System.out.println("\n======= SKRIPSI =======");
        Skripsi skripsi1 = new Skripsi("21081010048", "Pemrograman Java", "RH. Sianipar", "Andi Offset", 2019);
        System.out.println(skripsi1.toString());
    }
}
