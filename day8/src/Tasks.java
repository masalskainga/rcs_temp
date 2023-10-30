import java.util.Scanner;

public class Tasks {
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        String[] virkne = new String[5];
        for (int i = 0; i < virkne.length; i++) {
            System.out.println("Ievadi tekstu");
            virkne[i] = sc.nextLine();
        }
        System.out.println("......");
        for (int i = 0; i < virkne.length; i++) {
            System.out.println(virkne[i] + ",");
        }
        System.out.println();
    }


    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet masīva garumu");
        int garums = sc.nextInt();

        int[] masivs = new int[garums];


        for (int i = 0; i < masivs.length; i++) {
            System.out.println("Lūdzu ievadiet skaitli");
            masivs[i] = sc.nextInt();
        }
        System.out.println("......");

        for (int i = 0; i < masivs.length; i++) {
            System.out.println(masivs[i] + ",");
        }
        System.out.println();
    }
}
