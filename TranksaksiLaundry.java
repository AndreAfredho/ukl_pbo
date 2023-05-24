/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class TranksaksiLaundry {

    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    int saldoA, idTemp;

    public void inputTransaksi() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n==========  LaundrySatset ~ Input Laundry  ==========\n");
        System.out.println("Masukkan ID Client, Jenis Laundry(0/1) dan berat laundry (kg) !");
        System.out.print("ID Client     : ");
        idTemp = in.nextInt();
        System.out.print("Jenis Laundry : ");
        int jenisTemp = in.nextInt();
        System.out.print("Berat laundry : ");
        int beratTemp = in.nextInt();
        this.idClient.add(idTemp);
        this.idJenisLaundry.add(jenisTemp);
        this.banyak.add(beratTemp);
    }

    public void prosesTransaksi(Client client, JenisLaundry jL) {
        System.out.println("\n==========  LaundrySatset ~ Transaksi ==========\n");
        System.out.println("Yang Terhormat Bapak/Ibu : " + client.getNama(idClient.get(0))
                + "\nDengan Alamat            : " + client.getAlamat(idClient.get(0))
                + "\nNomor Telp.              : " + client.getTelepon(idClient.get(0))
                + "\nSaldo Anda               : " + client.getSaldo(idClient.get(0)));
        System.out.println("Mengambil Jenis          : " + jL.getJenisLaundry(idJenisLaundry.get(0))
                + "\nDengan Harga             : " + (jL.getHarga(idJenisLaundry.get(0)) * this.banyak.get(0))
                + " Rupiah\nDurasi                   : " + (jL.getDurasi(idJenisLaundry.get(0)) * this.banyak.get(0))
                + " Menit");
        saldoA = client.getSaldo(idTemp) - (jL.getHarga(idJenisLaundry.get(0)) * this.banyak.get(0));
    }

    public void laporanAkhir(Client client, JenisLaundry jL) {
        System.out.println("\n==========  LaundrySatset ~ Saldo ==========\n");
        System.out.println("Yang Terhormat Bapak/Ibu : " + client.getNama(idClient.get(0)) + "\nSaldo Anda Menjadi       : " + saldoA);
        System.out.println("\n==========  LaundrySatset ~ Terimakasih !  ==========\n");
    }
}
