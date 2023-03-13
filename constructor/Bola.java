/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author DELL
 */
public class Bola {
    public double radius;
    public double volume;
    
    public Bola(){
        this.radius = 5;
    }
    
    public Bola(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = 1.3333333333333333 * 3.14 * (this.radius * this.radius * this.radius) ;
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
