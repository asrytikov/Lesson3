public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if (num2>num1){
            System.out.println("First > second");
        } else if (num2<num1){
            System.out.println("First < second");
        }else{
            System.out.println("First = second");
        }

        if (num2<num1 || num1>20){
            System.out.println("First > second and first < 20");
        }

        int num = 6;

        switch (num){
            case 1:
                System.out.println("Number = 1");
                break;
            case 7:
            case 8:
                System.out.println("Number = 8");
                num++;
                //break;
            case 9:
                System.out.println("Number = 9");
                break;
            default:
                System.out.println("Number != 1, 8, 9");
        }

        int x=3, y = 3;

        int z = x>y ? (x+y) : (x-y);
        System.out.println(z);

    }
}