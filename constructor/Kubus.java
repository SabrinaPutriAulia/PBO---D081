/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author DELL
 */
public class Kubus {
    public double sisi;
    public double volume;
    
    public Kubus(){
        this.sisi = 7; // default nilai sisi
    }
    
    public Kubus(double sisi){ // dengan parameter
        this.sisi = sisi;
    }
    
     public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = this.sisi * this.sisi * this.sisi;
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
