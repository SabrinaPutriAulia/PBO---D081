/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author DELL
 */
public class Tabung {
    public double radius;
    public double tinggi;
    public double volume;
    
    public Tabung(){
        this.radius = 5;
        this.tinggi = 7;
    }
    
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = 3.14 * (this.radius * this.radius) * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
