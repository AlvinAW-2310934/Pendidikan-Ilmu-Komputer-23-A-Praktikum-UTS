package com.mycompany.utspbo;

/**
 *
 * @author alvin
 */
public class UtsPbo_SoalNo2{
    public static void main(String[] args){
        System.out.println("Pattern A:");
        patternA();
        System.out.println("\nPattern B:");
        patternB();
        System.out.println("\nPattern C:");
        patternC();
        System.out.println("\nPattern D:");
        patternD();
    }

    public static void patternA(){
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternB(){
        for(int i = 6; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternC(){
        for(int i = 1; i <= 6; i++){
            for(int s = 1; s <= 6 - i; s++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternD(){
        for(int i = 6; i >= 1; i--){
            for(int s = 1; s <= 6 - i; s++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}