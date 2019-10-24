/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan46tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age age = new Age(2019);        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println(age.tandanyaKamu(age.hitungUmur()));
        
   
    }
    
}
