package com.mycompany.utspbo;

/**
 *
 * @author alvin
 */

import java.util.Scanner;

public class UtsPbo_SoalNo3{
    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.print("Masukkan bilangan bulat: ");
            number = input.nextInt();
            if(number < 100 || number > 999){
               System.out.println("Input tidak valid. Harus bilangan 3 digit.");
            }
        }while(number < 100 || number > 999);

        int reversed = reverse(number);
        System.out.println("Hasil pembalikan: " + reversed);

        if(isPalindrome(number)){
           System.out.println(number + " adalah palindrome.");
        }else{
           System.out.println(number + " bukan palindrome.");
        }
    }
}
