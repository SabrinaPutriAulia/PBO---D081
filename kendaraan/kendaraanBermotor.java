/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class kendaraanBermotor extends Kendaraan{
    int kecepatan;
    
    public kendaraanBermotor(String nama, int jarakTempuh, int kecepatan) {
        super(nama, jarakTempuh);
        this.kecepatan = kecepatan;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Dikendarai dengan kecepatan: " + kecepatan + " km/jam");
    }
    
    public void drive(String time) {
        System.out.println("Berkendara pada            : " + time + " hari");
    }
    
    public void drive(int penumpang) {
        System.out.println("Berkendara dengan          : " + penumpang + " penumpang");
    }
}
