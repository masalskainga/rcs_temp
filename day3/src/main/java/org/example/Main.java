package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       sample1();
       uzd1();
    }
    public static void uzd1() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli!");
            int skaitlis = sc.nextInt();
        }

    }
    public static void sample1() {
        for(int i = 0; i < 10; i++){
            System.out.println("Hello world!");
        }
        for(int i = 0; i < 5; i++){
            if(i != 1){
                System.out.println("Hello world!");
            }else{
                System.out.println("aaa");
            }
        }
    }
}