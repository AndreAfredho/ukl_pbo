/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry1;

/**
 *
 * @author Andre
 */
public class LaporanLaundry {

    public void kiw(Client client) {
        int x = client.getJmlCl();
        System.out.println("======= LaundrySatset ~ Info Client=======");
        for (int i = 0; i < x; i++) {
            System.out.println("Member " + (i) + "       :" + client.getNama(i)
                    + "\nAlamat         : " + client.getAlamat(i)
                    + "\nNo. telp       : " + client.getTelepon(i)
                    + "\nSaldo          : " + client.getSaldo(i));
            System.out.println();
        }
    }

    public void kiw(Petugas petugas) {
        int x = petugas.getJmlPetugas();
        System.out.println("======= LaundrySatset ~ Info Petugas=======");
        for (int i = 0; i < x; i++) {
            System.out.println("Member " + (i) + " :" + petugas.getNama(i)
                    + "\nAlamat         : " + petugas.getAlamat(i)
                    + "\nNo. telp       : " + petugas.getTelepon(i));
            System.out.println();
        }
    }
}
