/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector3;
/**
 *
 * @author DELL
 */
public class Vector3 {
    int[] vector = new int[3];
    
    public Vector3(int x, int y, int z){
        this.vector[0] = x;
        this.vector[1] = y;
        this.vector[2] = z;
    };
    
    public Vector3 operate(int skalar) {
        Vector3 result = new Vector3(0, 0 ,0);
        for (int i = 0; i < 3; i++) {
            result.vector[i] = vector[i] * skalar;
        }
        return result;
    }
    
    public int operate(Vector3 vektor) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = result + vector[i] * vektor.vector[i];
        }
        return result;
    }
}
