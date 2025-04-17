package com.mycompany.utspbo;

/**
 *
 * @author alvin
 */

import java.util.Scanner;

public class UtsPbo_SoalNo1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer : ");
        int angka = input.nextInt();

        if(angka >= 100 && angka <= 999){
            int ratusan = angka / 100;
            int satuan = angka % 10;

            if(ratusan == satuan){
                System.out.println(angka + " adalah palindrome");
            }else{
                System.out.println(angka + " bukan palindrome");
            }
        }else{
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat tiga digit.");
        }
    }
}