public class Main {
    public static void main(String[] args) {
        int a = 3;
        task1(a);
        task1(8);

        Samples.sample1();

//        int result = Samples.sample2();
//        System.out.println(result);

        Samples.sample3("aa", "ss", "xx");

//        int result = Samples.sample4(5,8);
//        System.out.println(result);

//        int result = Tasks.task2();
//        System.out.println(result);
//
        int result = Tools.power(2,4);
        System.out.println(result);
    }


    static void task1(int number){
        if(number % 2 ==0){
            System.out.println("Pāra");
        }else{
            System.out.println("Nepāra");
        }
    }


}