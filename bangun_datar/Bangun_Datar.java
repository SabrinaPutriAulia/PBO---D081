/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun_datar;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Bangun_Datar {
    public int lengthofside, width, height;
    public double radius, majorRadius, minorRadius;
    public final double phi = 3.14;

    public int SquareArea(){
        int area;
        area = this.lengthofside * this.lengthofside;
        return area;
    }
    public int SquarePerimeter(){
        int perimeter;
        perimeter = this.lengthofside + this.lengthofside;
        return perimeter;
    }
    
    public int RectangleArea(){
        int area;
        area = this.width *this. height;
        return area;
    }
    public int RectanglePerimeter(){
        int perimeter;
        perimeter = 2 * (this.width + this.height);
        return perimeter;
    }
    
    public double CircleArea(){
        double area, pi = 3.14;
        area = pi * this.radius * this.radius;
        return area;
    }
    public double CirclePerimeter(){
        double perimeter;
        perimeter = 2 * phi * this.radius;
        return perimeter;
    }
    
    public double ElipsArea(){
        double area, pi = 3.14;
        area = pi* this.majorRadius * this.minorRadius;
        return area;
    }
    public double ElipsPerimeter(){
        double perimeter;
        double c = Math.sqrt((this.majorRadius * this.majorRadius)+(this.minorRadius * this.minorRadius)/2);
        perimeter = 2 * phi * c;
        return perimeter;
    }
}
