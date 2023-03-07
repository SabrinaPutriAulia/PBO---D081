/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecalculator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class Main_SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The original input
        System.out.print("Masukkan operasi aritmatika dasar: ");
        String inputUser = input.nextLine();

        SimpleCalculator output = new SimpleCalculator();
        output.inputProses(inputUser);
    }
}
