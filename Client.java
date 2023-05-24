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
public class Client implements Laundry1 {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        // Client 1
        this.namaClient.add("Andre");
        this.alamat.add("Pasuruan");
        this.saldo.add(1000000);
        this.telepon.add("088804948921");
        // Client 2
        this.namaClient.add("Axel");
        this.alamat.add("Pasuruan");
        this.saldo.add(1000000);
        this.telepon.add("088996348066");
        // Client 3
        this.namaClient.add("Kamal");
        this.alamat.add("malang");
        this.saldo.add(1000000);
        this.telepon.add("088746252522");
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int saldo) {
        return this.saldo.get(saldo);
    }

    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int nama) {
        return this.namaClient.get(nama);
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getTelepon(int telp) {
        return this.telepon.get(telp);
    }

    public int getJmlCl() {
        return this.namaClient.size();
    }

}

