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
public class Petugas implements Laundry1 {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas() {
        this.namaPetugas.add("Buyudi");
        this.alamat.add("Sawojajar");
        this.telepon.add("08976542891");
        this.jabatan.add(1);

        this.namaPetugas.add("Pakyudi");
        this.alamat.add("Sawojajar");
        this.telepon.add("08662255117");
        this.jabatan.add(2);
// overload ada parameter,override biasanya tidak ada parameter(penumpukan data)
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int jabatan) {
        return this.jabatan.get(jabatan);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getNama(int nama) {
        return this.namaPetugas.get(nama);
    }

    @Override
    public String getTelepon(int telp) {
        return this.telepon.get(telp);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    public int getJmlPt() {
        return this.namaPetugas.size();
    }
}
    

