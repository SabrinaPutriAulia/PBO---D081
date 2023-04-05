/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busrapidtransit;

/**
 *
 * @author DELL
 */
public class BusRapidTransit {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("OUTPUT:");
        System.out.println("-----------------------------------------");
        bus bus = new bus();
        bus.naik("PORONG", 3);
        bus.naik("Surabaya", 2);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPenumpang() + " penumpang");
        System.out.println("-----------------------------------------");
        bus.tibaDiHalte(1);
        bus.turun(3, "PORONG");
        bus.naik("Surabaya", 1);
        bus.naik("GRESIK", 1);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPenumpang());
        System.out.println("-----------------------------------------");
        bus.tibaDiHalte(2);
        bus.turun(3, "SURABAYA");
        bus.naik("GRESIK", 5);
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPenumpang());
        System.out.println("-----------------------------------------");
        bus.tibaDiHalte(3);
        bus.turun(6, "GRESIK");
        System.out.println("    - Jumlah Penumpang: " + bus.getJumlahPenumpang());
        System.out.println("(!)Bus telah sampai di tujuan akhir");
        System.out.println("-----------------------------------------");
    }
}
