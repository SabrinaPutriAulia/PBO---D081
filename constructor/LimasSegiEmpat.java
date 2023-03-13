/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author DELL
 */
public class LimasSegiEmpat {
    public double sisi;
    public double tinggi;
    public double volume;
    
    public LimasSegiEmpat(){
        this.sisi = 5;
        this.tinggi = 7;
    }
    
    public LimasSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = 0.3333333333333333 * (this.sisi * this.sisi) * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
