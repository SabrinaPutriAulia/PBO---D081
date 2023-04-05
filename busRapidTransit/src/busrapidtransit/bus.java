/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busrapidtransit;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class bus {
    private ArrayList<Penumpang> penumpangList = new ArrayList<>();
    private int total_orang;
    private int tunggunaik, tungguturun;
    private String[] halteList = {"PULL/Kantor", "PORONG", "SURABAYA", "GRESIK"};

    public bus() {
        System.out.println("->  Bus berangkat dari " + halteList[0]);
    }

    public void turun(int jumlahPenumpangTurun, String namaHalte) {
        if (penumpangList.size() >= jumlahPenumpangTurun) {
            for (int i = 0; i < jumlahPenumpangTurun; i++) {
                penumpangList.remove(0);
            }
            System.out.println("    - " + jumlahPenumpangTurun + " penumpang turun di Halte " + namaHalte);
            this.total_orang = penumpangList.size();
            }
    }
    

    public void naik(String tujuan, int jumlahPenumpangNaik) {
        for (int i = 0; i < jumlahPenumpangNaik; i++) {
            Penumpang penumpangBaru = new Penumpang(tujuan);
            penumpangList.add(penumpangBaru);
        }
        System.out.println("    - " + jumlahPenumpangNaik + " penumpang naik. Tujuan: " + tujuan);
        this.total_orang = penumpangList.size();
    }
    
    public void tibaDiHalte(int nomorHalte) {
        System.out.println("->  Bus sampai di Halte " + halteList[nomorHalte]);
    }
    
    public int getJumlahPenumpang(){
        return this.total_orang;
    }
}
