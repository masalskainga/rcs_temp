import java.util.Scanner;

public class Geometrija {
    public static int Trijsturis(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    public static int Cetrsturis(int a, int b, int c, int d){
        int sum = a + b + c + d;
        return sum;
    }

    public static double triangle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi pirmās malas izmēru:");
        double side1 = scanner.nextDouble();

        System.out.println("Ievadi otrās malas izmēru: ");
        double side2 = scanner.nextDouble();

        System.out.println("Ievadi trešās malas izmēru: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        System.out.println("Trijstūra perimetrs ir: " + perimeter);

        return perimeter;

    }

    public static double rectangle(double side1, double side2, double side3, double side4) {
        double perimeter = side1 + side2 + side3 + side4;

        System.out.println("Četrstūra perimetrs ir: " + perimeter);

        return perimeter;
    }
}
