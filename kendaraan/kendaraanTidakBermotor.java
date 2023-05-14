/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class kendaraanTidakBermotor extends Kendaraan {
    String penggerak;
    
    public kendaraanTidakBermotor(String nama, int jarakTempuh, String penggerak) {
        super(nama, jarakTempuh);
        this.penggerak = penggerak;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Digerakkan oleh            : " + penggerak);
    }
    
    public void ride(String time) {
        System.out.println("Berkendara pada            : " + time + " hari");
    }
    
    public void ride(int penumpang) {
        System.out.println("Berkendara dengan          : " + penumpang + " penumpang");
    }
    
}
