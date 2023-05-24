/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry1;

import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.jenisLaundry.add("0. Cepat");
        this.harga.add(30000);
        this.durasi.add(5); // Per-kilo
        this.jenisLaundry.add("1. lambat");
        this.harga.add(20000);
        this.durasi.add(10); // Per-kilo
    }

    public String getJenisLaundry(int index) {
        return this.jenisLaundry.get(index);
    }

    public int getHarga(int index) {
        return this.harga.get(index);
    }

    public int getDurasi(int index) {
        return this.durasi.get(index);
    }

    public void laporanpLaundry() {
        System.out.println("======= LaundrySatset ~ Info Laundry =======");
        for (int i = 0; i < this.jenisLaundry.size(); i++) {
            System.out.println("Jenis Laundry   : " + this.getJenisLaundry(i) +
                    "\nHarga        : " + this.getHarga(i) +
                    "\nDurasi       : " + this.getDurasi(i));
        }
    }

}
