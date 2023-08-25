package p1;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            System.out.println("Hello" + i);
        }

        int x = 1;

        for(;x<5;){
            System.out.println("Test");
            x++;
        }

        int n = 10;
        for (int i =0, j = n-1; i<j; i++, j--){
            System.out.println(i*j);
        }

        for (int i = 10; i<0; i++){
            System.out.println("Privet" + i);
        }

        int j = 6;

        while (j>0){
            System.out.println("While " + j);
            j--;
        }

        for (int i = 0; i<10; i++){
            if (i==5) break;
            System.out.println("Break" + i);
        }

        for (int i = 0; i<10; i++){
            if (i==5) continue;
            System.out.println("continue" + i);
        }

        int k = 7;

        do{
            System.out.println("Do " + k);
            k--;
        }
        while (k==0);

    }

}
