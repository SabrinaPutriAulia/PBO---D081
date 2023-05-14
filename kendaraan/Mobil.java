/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class Mobil extends kendaraanBermotor {
    String bahanBakar;
    
    public Mobil(String nama, int jarakTempuh, int kecepatan, String bahanBakar) {
        super(nama, jarakTempuh, kecepatan);
        this.bahanBakar = bahanBakar;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Bahan bakar                : " + bahanBakar);
    }
    
    public void drive(String time) {
        System.out.println("Berkendara pada            : " + time + " hari");
    }
    
    public void drive(int penumpang) {
        System.out.println("Berkendara dengan          : " + penumpang + " penumpang");
    }
}
