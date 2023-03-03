/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main_Kalkulator {
    public static void main(String[] args) {
        int pilihan;
        char ulang;
        Scanner sc = new Scanner(System.in);
        Kalkulator output = new Kalkulator();
        do{
        System.out.println("");
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("PILIH OPERASI: ");
        pilihan = sc.nextInt();
        System.out.println("");
        switch(pilihan){
            case 1:
                System.out.print("Masukkan angka1: ");
                output.angka1 = sc.nextDouble();
                System.out.print("Masukkan angka2: ");
                output.angka2 = sc.nextDouble();
                System.out.println(output.pertambahan());
            break;
            case 2:
                System.out.print("Masukkan angka1: ");
                output.angka1 = sc.nextDouble();
                System.out.print("Masukkan angka2: ");
                output.angka2 = sc.nextDouble();
                System.out.println(output.pengurangan());
            break;
            case 3:
                System.out.print("Masukkan angka1: ");
                output.angka1 = sc.nextDouble();
                System.out.print("Masukkan angka2: ");
                output.angka2 = sc.nextDouble();
                System.out.println(output.perkalian());
            break;
            case 4:
                System.out.print("Masukkan angka1: ");
                output.angka1 = sc.nextDouble();
                System.out.print("Masukkan angka2: ");
                output.angka2 = sc.nextDouble();
                System.out.println(output.pembagian());
            break;
            case 5:
                System.out.print("Masukkan angka1: ");
                output.angka1 = sc.nextDouble();
                System.out.print("Masukkan angka2: ");
                output.angka2 = sc.nextDouble();
                System.out.println(output.modulus());
            break;
            default:
                System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
        }
            System.out.println("");
            System.out.print("(?) Apakah anda ingin mengulangi perhitungan? (y/t): ");
            ulang = sc.next().charAt(0);
      } while (ulang != 't');
        System.out.println(" === TERIMA KASIH === ");
    }
}
