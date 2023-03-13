/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Constructor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int opsi;
        char ulang;
        
        do{
        System.out.println(" === MENGHITUNG VOLUME BANGUN RUANG === ");
        System.out.println("  1. Kubus");
        System.out.println("  2. Balok");
        System.out.println("  3. Tabung");
        System.out.println("  4. Limas Segi Empat");
        System.out.println("  5. Bola");
        System.out.println("  6. Keluar");
        System.out.print(" >> SILAHKAN MASUKAN PILIHAN ANDA: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.println(" === Multiple Constructor Kubus === ");
                System.out.println(" 1. Volume kubus dengan nilai default");
                System.out.println(" 2. Volume kubus dengan nilai masukan");
                System.out.print(" Pilihan: ");
                opsi = input.nextInt();
                if(opsi == 1){
                    Kubus kubus1 = new Kubus();
                    kubus1.ComputeAndSetVolume();
                    System.out.println(" Volume kubus dengan nilai default sisi " + kubus1.sisi + " adalah " + kubus1.GetVolume());
                } else if (opsi == 2) {
                    Kubus kubus2 = new Kubus();
                    System.out.print(" Masukkan sisi kubus: ");
                    kubus2.sisi = input.nextDouble();
                    kubus2.ComputeAndSetVolume();
                    System.out.println(" Volume kubus adalah " + kubus2.GetVolume());
                } else {
                    System.out.print(" (!) Pilihan tidak tersedia");
                }
                break;
            case 2:
                System.out.println(" === Multiple Constructor Balok === ");
                System.out.println(" 1. Volume balok dengan nilai default");
                System.out.println(" 2. Volume balok dengan nilai masukan");
                System.out.print(" Pilihan: ");
                opsi = input.nextInt();
                if(opsi == 1){
                    Balok balok1 = new Balok();
                    balok1.ComputeAndSetVolume();
                    System.out.println(" Volume kubus dengan nilai default: ");
                    System.out.println(" > Panjang = " + balok1.panjang);
                    System.out.println(" > Lebar   = " + balok1.lebar);
                    System.out.println(" > Tinggi = " + balok1.tinggi);
                    System.out.println(" adalah " + balok1.GetVolume());
                } else if (opsi == 2) {
                    Balok balok2 = new Balok();
                    System.out.print(" Masukkan panjang balok: ");
                    balok2.panjang = input.nextDouble();
                    System.out.print(" Masukkan lebar balok: ");
                    balok2.lebar = input.nextDouble();
                    System.out.print(" Masukkan tinggi balok: ");
                    balok2.tinggi = input.nextDouble();
                    balok2.ComputeAndSetVolume();
                    System.out.println(" Volume kubus adalah " + balok2.GetVolume());
                } else {
                    System.out.print(" (!) Pilihan tidak tersedia");
                }
                break;
            case 3:
                System.out.println(" === Multiple Constructor Tabung === ");
                System.out.println(" 1. Volume tabung dengan nilai default");
                System.out.println(" 2. Volume tabung dengan nilai masukan");
                System.out.print(" Pilihan: ");
                opsi = input.nextInt();
                if(opsi == 1){
                    Tabung tabung1 =new Tabung();
                    tabung1.ComputeAndSetVolume();
                    System.out.println(" Volume tabung dengan nilai default: ");
                    System.out.println(" > Radius = " + tabung1.radius);
                    System.out.println(" > Tinggi   = " + tabung1.tinggi);
                    System.out.println(" adalah " + tabung1.GetVolume());
                } else if (opsi == 2) {
                    Tabung tabung2 = new Tabung();
                    System.out.print(" Masukkan radius balok: ");
                    tabung2.radius = input.nextDouble();
                    System.out.print(" Masukkan tinggi balok: ");
                    tabung2.tinggi = input.nextDouble();
                    tabung2.ComputeAndSetVolume();
                    System.out.println(" Volume kubus adalah " + tabung2.GetVolume());
                } else {
                    System.out.print(" (!) Pilihan tidak tersedia");
                }
                break;
            case 4:
                System.out.println(" === Multiple Constructor Limas Segi Empat === ");
                System.out.println(" 1. Volume limas segi empat dengan nilai default");
                System.out.println(" 2. Volume limas segi empat dengan nilai masukan");
                System.out.print(" Pilihan: ");
                opsi = input.nextInt();
                if(opsi == 1){
                    LimasSegiEmpat limassegiempat1 = new LimasSegiEmpat();
                    limassegiempat1.ComputeAndSetVolume();
                    System.out.println(" Volume limas segi empat dengan nilai default: ");
                    System.out.println(" > Radius = " + limassegiempat1.sisi);
                    System.out.println(" > Tinggi   = " + limassegiempat1.tinggi);
                    System.out.println(" adalah " + limassegiempat1.GetVolume());
                } else if (opsi == 2) {
                    LimasSegiEmpat limassegiempat2 = new LimasSegiEmpat();
                    System.out.print(" Masukkan sisi  limas segi empat: ");
                    limassegiempat2.sisi = input.nextDouble();
                    System.out.print(" Masukkan tinggi limas segi empat: ");
                    limassegiempat2.tinggi = input.nextDouble();
                    limassegiempat2.ComputeAndSetVolume();
                    System.out.println(" Volume kubus adalah " + limassegiempat2.GetVolume());
                } else {
                    System.out.print(" (!) Pilihan tidak tersedia");
                }
                break;
            case 5:
                System.out.println(" === Multiple Constructor Bola === ");
                System.out.println(" 1. Volume bola dengan nilai default");
                System.out.println(" 2. Volume bola dengan nilai masukan");
                System.out.print(" Pilihan: ");
                opsi = input.nextInt();
                if(opsi == 1){
                    Bola bola1 = new Bola();
                    bola1.ComputeAndSetVolume();
                    System.out.println(" Volume bola dengan nilai default radius " + bola1.radius + " adalah " + bola1.GetVolume());
                } else if (opsi == 2) {
                    Bola bola2 = new Bola();
                    System.out.print(" Masukkan radius bola: ");
                    bola2.radius = input.nextDouble();
                    bola2.ComputeAndSetVolume();
                    System.out.println(" Volume bola adalah " + bola2.GetVolume());
                } else {
                    System.out.print(" (!) Pilihan tidak tersedia");
                }
                break;
            case 6:
                System.exit(pilihan);
            default:
                System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
        }
                System.out.print("(?) Apakah anda ingin mengulangi penghitungan? (y/t): ");
                ulang = input.next().charAt(0);
        }
        while (ulang != 't');
        System.out.println("(*)TERIMA KASIH");
    }
}
