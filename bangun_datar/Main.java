/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bangun_Datar output = new Bangun_Datar();
        int pilihan;
        char ulang;
                
        do{
        System.out.println(" === MENGHITUNG LUAS DAN KELILING BANGUN DATAR === ");
        System.out.println("  1. Persegi");
        System.out.println("  2. Persegi Panjang");
        System.out.println("  3. Lingkaran");
        System.out.println("  4. Elips");
        System.out.println("  5. Keluar");
        System.out.print(" >> SILAHKAN MASUKAN PILIHAN ANDA: ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.print("Masukkan sisi: ");
                output.lengthofside = input.nextInt();
                System.out.println("1. Luas Persegi");
                System.out.println("2. Keliling Persegi ");
                System.out.print("SILAHKAN MASUKAN PILIHAN ANDA: ");
                int a = input.nextInt();
                if(a == 1){
                    output.SquareArea();
                    System.out.println("Luas Persegi: " + output.SquareArea());
                } else if(a == 2){
                    output.SquarePerimeter();
                    System.out.println("Keliling Persegi: " + output.SquarePerimeter());
                } else{
                    System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
                }
                break;
            case 2:
                System.out.print("Masukkan lebar: ");
                output.width = input.nextInt();
                System.out.print("Masukkan tinggi: ");
                output.height=input.nextInt();
                System.out.println("1. Luas Persegi Panjang");
                System.out.println("2. Keliling Persegi Panjang ");
                System.out.print("SILAHKAN MASUKAN PILIHAN ANDA: ");
                int b = input.nextInt();
                if(b == 1){
                    output.RectangleArea();
                    System.out.println("Luas Persegi Panjang: " + output.RectangleArea());
                } else if(b == 2){
                    output.RectanglePerimeter();
                    System.out.println("Keliling Persegi Panjang: " + output.RectanglePerimeter());
                } else{
                    System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
                }
                break;
            case 3:
                System.out.print("Masukkan radius: ");
                output.radius=input.nextInt();
                System.out.println("1. Luas Lingkaran");
                System.out.println("2. Keliling Lingkaran ");
                System.out.print("SILAHKAN MASUKAN PILIHAN ANDA: ");
                int c = input.nextInt();    
                if(c == 1){
                    output.CircleArea();
                    System.out.println("Luas Lingkaran: " + output.CircleArea());
                } else if(c == 2){
                    output.CirclePerimeter();
                    System.out.println("Keliling Lingkaran: " + output.CirclePerimeter());
                } else{
                    System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
                }
                break;
            case 4:
                System.out.print("Masukkan radius major: ");
                output.majorRadius = input.nextInt();
                System.out.print("Masukkan radius minor: ");
                output.minorRadius = input.nextInt();
                System.out.println("1. Luas Elips");
                System.out.println("2. Keliling Elips ");
                System.out.print("SILAHKAN MASUKAN PILIHAN ANDA: ");
                int d = input.nextInt();
                if(d == 1){
                output.ElipsArea();
                System.out.println("Luas Elips: " + output.ElipsArea());
                } else if(d == 2){
                    output.ElipsPerimeter();
                    System.out.println("Keliling Elips: " + output.ElipsPerimeter());
                } else{
                    System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
                }
                break;
            default:
                System.out.println("(!)ANDA SALAH MEMASUKKAN KODE");
        }
                System.out.print("(?) Apakah anda ingin mengulangi penhgitungan? (y/t): ");
                ulang = input.next().charAt(0);
        }
        while (ulang != 't');
   }
}
