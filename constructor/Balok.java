/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author DELL
 */
public class Balok {
    public double panjang, tinggi, lebar;
    public double volume;
    
    //constructor
    public Balok(){
        this.panjang = 10;
        this.lebar = 2;
        this.tinggi = 5;
    }
    
    public Balok(double tinggi, double panjang, double lebar){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    
    public void SetPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void SetLebar(double lebar){
        this.lebar = lebar;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = 2 * ((this.panjang * this.lebar) + (this.lebar * this.tinggi) + (this.panjang * this.tinggi));
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
