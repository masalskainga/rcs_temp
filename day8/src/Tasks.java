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
        System.out.println("Ievadiet, cik virknes rakstīsiet");
        int skaitlis = sc.nextInt();
        String[] virkne2 = new String[skaitlis];


        for (int i = 0; i < virkne2.length; i++) {
            System.out.println("Ievadi tekstu");
            virkne2[i] = sc.nextLine();
        }
        System.out.println("......");

        for (int i = 0; i < virkne2.length; i++) {
            System.out.println(virkne2[i] + ",");
        }
        System.out.println();
    }
}
