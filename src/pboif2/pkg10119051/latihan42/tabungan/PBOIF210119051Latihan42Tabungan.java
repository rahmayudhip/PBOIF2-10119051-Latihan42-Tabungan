/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan42.tabungan;

import data.Tabungan;
import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program tabungan
 */
public class PBOIF210119051Latihan42Tabungan {

    
    public static void main(String[] args) {
         int jumlah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan objTabungan = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = objTabungan.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : "+jumlah);
    }
    
}
