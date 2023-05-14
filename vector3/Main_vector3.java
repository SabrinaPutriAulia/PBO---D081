/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector3;

/**
 *
 * @author DELL
 */
public class Main_vector3 {
    public static void main(String[] args) {
        // membuat objek Vector3
        Vector3 vectorA = new Vector3(1, 2, 3);
        Vector3 vectorB = new Vector3(4, 5, 6);
        
        Vector3 resultA = vectorA.operate(5);
        System.out.println("Hasil perkalian vektor dengan skalar: [" + resultA.vector[0] + " " + resultA.vector[1] + " " + resultA.vector[2] + "]");
        
        int resultB = vectorA.operate(vectorB);
        System.out.println("Hasil perkalian vektor dengan vektor: " + resultB);
    }
}
