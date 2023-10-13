import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sample1();
//
//        for(int i = 0; i < 5; i++){
//            sample1();
//        }
//        int a = sample2();
//        System.out.println(a);

//        System.out.println(sample2());
//
//        System.out.println(uzd1());


        uzd2("&&&&");
    }

    static void uzd2(String a){
        System.out.println(a);
    }
    public static String uzd1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet tekstu!");
        String result = "";
        for(int i = 0; i < 3; i++) {

            String input = sc.nextLine();
        }

        return  result;

    }
    public static void sample1() {
        System.out.println("aaa");
    }
    public static int sample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli!");
        int sk2 = sc.nextInt();

        int result = sk1 + sk2;
        return result;


    }
}
