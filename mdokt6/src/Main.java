import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mdokt6();
        mdokt11();
}


public static void mdokt6(){
    int number = 5;
    for (int i = 0; i <= number; i++){
        System.out.println("&");
    }
       System.out.println();
}
public static void mdokt11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lūdzu, norādi, cik frāzes vēlies ievadīt.");
    int number = sc.nextInt();
    String ievade = sc.nextLine();
    for (int i = 0; i < number; i++) {
        System.out.println("Lūdzu, ievadi frāzi.");
        String fraze = sc.nextLine();

    }
    String fraze = ievade.length();
    }

}


