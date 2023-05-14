/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author DELL
 */
public class Delman extends kendaraanTidakBermotor{
    String operasi;
    
    public Delman(String nama, int jarakTempuh, String penggerak, String operasi) {
        super(nama, jarakTempuh, penggerak);
        this.operasi = operasi;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Beroperasi di              : " + operasi);
    }
    
    public void ride(String time) {
        System.out.println("Berkendara pada            : " + time + " hari");
    }
    
    public void ride(int penumpang) {
        System.out.println("Berkendara dengan          : " + penumpang + " penumpang");
    }
    
}
