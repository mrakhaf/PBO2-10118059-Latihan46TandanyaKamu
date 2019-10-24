/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan46tandanyakamu;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Age {
    private int yearBirth, yearNow;
    private String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
        
    }
    
    public String tandanyaKamu(int umur){
        System.out.print("Tandanya Kamu ");
        System.out.print(red);
        
        if((umur>= 0) && (umur <= 5)){
            System.out.print("LAGI LUCU-LUCU NYA");
        } else if ((umur > 5) && (umur <= 10)){
            System.out.print("MASIK ANAK-ANAK");
        } else if ((umur > 10) && (umur <= 13)){
            System.out.print("MASIH REMAJA");
        } else if ((umur > 13) && (umur <= 19)){
            System.out.print("ALAY");
        } else if ((umur > 19) && (umur <= 29)){
            System.out.print("LAGI GALAU NYARI JODOH");
        } else if ((umur > 29) && (umur <= 35)){
            System.out.print("LAGI SIBUK NYARI UANG");
        } else if ((umur > 35) && (umur <= 150)){
            System.out.print("SUDAH TUA");
        } else if ((umur < 0) || (umur > 150)){
            System.out.print("TIDAK TERDETEKSI DI KEHIDUPAN");
        }
      
        return red;
        
    }

    
    
    
}
