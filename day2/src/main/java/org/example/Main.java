package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        uzd2();
        uzd1();
        sample1();
        sample3();
        homework();
    }
    public static void homework(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi tekstu!");
        String virkne = sc.nextLine();
        int garums = virkne.length();
        System.out.println(garums);
        if(garums >= 5 && virkne.contains ("aba")) {
            System.out.println("Ievade veiksmīga!");
        }else {
            System.out.println("Kļūda!");
        }
    }
    public static void sample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi 1 skaitli!");
        int a = sc.nextInt();
        System.out.println("Ievadi 2 skaitli");
        int b = sc.nextInt();
        int result = a + b;
        if(result >= 5 && result <= 15){
            System.out.println("Ievade veiksmīga");
        }else{
            System.out.println("Kļūda");
        }

    }
    public static void uzd2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi tekstu!");
        String a = sc.nextLine();
        int garums = a.length();
        System.out.println(garums);
        if(garums >= 5) {
            System.out.println("Ievade veiksmīga!");
        }else if(garums < 5){
            System.out.println("Kļūda!");
        }
    }
    public static void uzd1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi 1 skaitli");
        int a = sc.nextInt();
        System.out.println("Ievadi 2 skaitli");
        int b = sc.nextInt();
        int result = a + b;

        if(result > 10) {
            System.out.println("###");
        }else if(result < 10){
            System.out.println("####");
        }
    }
    public static void sample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi 1 skaitli");
        int skaitlis1 = sc.nextInt();
        System.out.println("Ievadi 2 skaitli");
        int skaitlis2 = sc.nextInt();
        System.out.println ("Rezultāts ir " + (skaitlis1 + skaitlis2));
    }

}