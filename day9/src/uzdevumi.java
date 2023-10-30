import java.util.Random;
import java.util.Scanner;

public class uzdevumi {
    public static void uzd1(){
        Scanner sc = new Scanner(System.in);
        String[] array = new String[8];
        virkne(array);
    }
    public static void virkne(String[] array){

        int count = 0;
        for(int i = 0; i < array.length; i++){
            int count = count + array[i].length();

        }
        System.out.println(count);
    }
    public static void uzd2(){
        
    }
    private static int[] randomSk(){
        int[] numMasivs = new int[5];

        for(int i = 0; i < numMasivs.length; i++){
            Random rand = new Random();
            int rand1 = rand.nextInt(6);
        }
        return int rand1;
    }
}
