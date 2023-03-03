/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Kalkulator {
    static double angka1, angka2;
    
    public double pertambahan(){
        double hasil;
        hasil = this.angka1 + this.angka2;
        System.out.print( "Hasil Pertambahan: " + angka1 + " + " + angka2 + " = ");
        return hasil;
    }
    
    public double pengurangan() {
        double hasil;
        hasil = this.angka1 - this.angka2;
        System.out.print( "Hasil Pengurangan: " + angka1 + " - " + angka2 + " = ");
        return hasil;
    }
    
    public double perkalian() {
        double hasil;
        hasil = this.angka1 * this.angka2;
        System.out.print( "Hasil Perkalian: " + angka1 + " * " + angka2 + " = ");
        return hasil;
    }
    
    public double pembagian() {
        double hasil;
        hasil = this.angka1 / this.angka2; 
        System.out.print( "Hasil Pembagian: " + angka1 + " / " + angka2 + " = ");
        return hasil;
    }
    
    public double modulus() {
        double hasil;
        hasil = this.angka1 % this.angka2;
        System.out.print( "Hasil Modulus: " + angka1 + " % " + angka2 + " = ");
        return hasil;
    }
}
