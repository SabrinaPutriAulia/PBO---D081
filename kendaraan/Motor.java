/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class Motor extends kendaraanBermotor{
    String kondisi;
    
    public Motor(String nama, int jarakTempuh, int kecepatan, String kondisi) {
        super(nama, jarakTempuh, kecepatan);
        this.kondisi = kondisi;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Kondisi kendaraan          : " + kondisi);
    }
    
    public void drive(String time) {
        System.out.println("Berkendara pada            : " + time + " hari");
    }
    
    public void drive(int penumpang) {
        System.out.println("Berkendara dengan          : " + penumpang + " penumpang");
    }

}
