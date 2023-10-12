import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        uzd2();
        uzd1();
        sample1();
    }

    public static void uzd2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Izvēlies, cik skaitļus ievadīt");
        int a = sc.nextInt();
        double sum = 0;
        for(int i = 0; i < a; i++){
            System.out.println("Ievadiet skaitli");
            double input = sc.nextDouble();
            System.out.println(input);
            sum = sum + input;
        }
        System.out.println("Vidējais ir" + (sum/a));

    }
    public static void uzd1(){
        for(int i = 100; i <= 150; i++){
            System.out.println(i);
        }
    }
    public static void sample1(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("aaa");
    }
}