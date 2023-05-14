/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class Kendaraan {
    String nama;
    int jarakTempuh;
    
    public Kendaraan(String nama, int jarakTempuh) {
        this.nama = nama;
        this.jarakTempuh = jarakTempuh;
    }
    
    public void display() {
        System.out.println("Nama Kendaraan             : " + nama);
        System.out.println("Telah menempuh jarak       : " + jarakTempuh + " km");
    }
    
    public static void main(String[] args) {
        System.out.println("KENDARAAN");
        Kendaraan k1 = new Kendaraan("Mobil Honda CR-V", 12);
        k1.display();
        
        System.out.println("\nKENDARAAN BERMOTOR");
        kendaraanBermotor a = new kendaraanBermotor("Mobil Honda CR-V", 12, 80);
        a.display();
        a.drive(4);
        a.drive("malam");
        
        System.out.println("\nMOBIL");
        Mobil b = new Mobil("Mobil Honda CR-V", 12, 80, "Solar");
        b.display();
        b.drive(4);
        b.drive("malam");
        
        System.out.println("\nMOTOR");
        Motor c = new Motor("Motor Honda Vario", 8, 60, "Sangat Baik");
        c.display();
        c.drive(2);
        c.drive("pagi");
        
        System.out.println("\nKENDARAAN TIDAK BERMOTOR");
        kendaraanTidakBermotor d = new kendaraanTidakBermotor("Delman", 2, "Kuda");
        d.display();
        d.ride(3);
        d.ride("pagi");
        
        System.out.println("\nDELMAN");
        Delman e = new Delman("Delman", 2, "Kuda", "Sekitaran Monas");
        e.display();
        e.ride(4);
        e.ride("sore");
        
        
    }
    
}
