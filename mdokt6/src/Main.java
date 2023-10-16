import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mdokt6();
        mdokt11();
}


public static void mdokt6(){
    String sum = "&";
    System.out.println(sum);
    for (int i = 0; i < 3; i++){
        sum = sum + "&";
        System.out.println(sum);
    }

}
public static void mdokt11() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lūdzu, norādi, cik frāzes vēlies ievadīt.");
    int number = sc.nextInt();
    String ievade = sc.nextLine();

    int garaka = 0;

    for (int i = 0; i < number; i++) {
        System.out.println("Lūdzu, ievadi frāzi.");
        String fraze = sc.nextLine();
        garaka = garaka + fraze.length();
        if(fraze.length() < garaka){
            System.out.println(garaka);
    }

    }
    }

}


