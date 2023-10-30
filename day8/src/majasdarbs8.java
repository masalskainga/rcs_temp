import java.util.Scanner;

public class majasdarbs8 {
    public static void md1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet masīva garumu");
        int garums = sc.nextInt();
        int[] masivs = new int[garums];

        int sum = 0;
        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Lūdzu ievadiet skaitli");
            masivs[i] = sc.nextInt();

            sum = sum + masivs[i];
            System.out.println(sum);

        }

        System.out.println("......");

        for (int i = 0; i < masivs.length; i++) {
            double average = (double) sum / garums;
            System.out.println(average);
        }
        System.out.println();
    }
    public static void md2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet meklējamo skaitli");
        int skaitlis = sc.nextInt();

        int[] numurs = new int[10];
        numurs[0] = 1;
        numurs[1] = 8;
        numurs[2] = 10;
        numurs[3] = 11;
        numurs[4] = 38;
        numurs[5] = 77;
        numurs[6] = 18;
        numurs[7] = 10;
        numurs[8] = 6;
        numurs[9] = 77;


        System.out.println("----");

        for(int i = 0; i < numurs.length; i++){
            System.out.println(numurs[]);
        }
    }
}
