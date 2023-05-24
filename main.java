/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry1;

/**
 *
 * @author Andre
 */
public class main {
     public static void main(String[] args) {
         
        TranksaksiLaundry transaksi = new TranksaksiLaundry();
        JenisLaundry jenislaundry = new JenisLaundry();
        Petugas petugas = new Petugas();
        Client client = new Client();
        LaporanLaundry lp = new LaporanLaundry();
        
        
        lp.kiw(client);
        lp.kiw(petugas);
        jenislaundry.laporanpLaundry(); // Menampilkan semua info Laundry
        transaksi.inputTransaksi(); // Bagian Input dari Transaksi
        transaksi.prosesTransaksi(client, jenislaundry); // Bagian proses dari transaksi
        transaksi.laporanAkhir(client, jenislaundry); // Akhir dari Proses transaksi
        
        
        
//        TranksaksiLaundry tl = new TranksaksiLaundry();
//        Client c = new Client();
//        LaporanLaundry l = new LaporanLaundry();
//        Petugas p = new Petugas();
//        JenisLaundry jl = new JenisLaundry();

//        TranksaksiLaundry t = new TranksaksiLaundry();
//        Client c = new Client();
//        LaporanLaundry l = new LaporanLaundry();
//        JenisLaundry b = new JenisLaundry();
//        Petugas K = new Petugas();
//      
//        l.laporanlaundry(b);
//        l.laporanlaundry(c);
//        l.laporanlaundry(K);
//        t.prosesTransaksi(c, t, b);

       
//        l.laporanlaundry(c);
//        l.laporanlaundry(p);
//        l.laporanlaundry(jl);
//        tl.prosesTransaksi(c, tl, jl);
//        
//       l.laporanlaundry(tl, jl);
     }
}
