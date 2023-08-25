package p3;

public class Main {

    public static void main(String[] args) {
        hello();
        welcome();
        int a = 10;
        int b = 20;
        sum(a, b);
        sum(30, b);
        sum(5,10);
        sum2("test",1,2,3);
        sum2("test",1,2,3,4,5);
        sum2("test");
        int x = sum3(1,2,3);
        System.out.println(x);

        daytime(25);
        //System.out.println(inf_day);
    }
    static void hello(){
        System.out.println("hello");
    }
    static void welcome(){
        System.out.println("welcome");
    }
    static void sum(int x, int y){
        int z = x + y;
        System.out.println(z);
    }

    static void sum2(String message, int ...nums){
        System.out.println(message);
        int res = 0;
        for (int n: nums) {
            res +=n;
        }
        System.out.println(res);
    }

    static int sum3(int a, int b, int c){
        return a+b+c;
    }

    static void daytime(int hour){
        if (hour>24) return;
        if (hour>21 || hour < 6){
            System.out.println("Night");
        }else{
            System.out.println("Day");
        }
    }



}
