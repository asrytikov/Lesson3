package p2;

public class Main {

    public static void main(String[] args) {

        int numbers1[];

        int[] numbers2;

        numbers1 = new int[5];

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }

        System.out.println();

        int[] nums = {1,2,3,4,5};
        int[] nums2 = new int[]{1,2,3,4,5,0};
        System.out.println(nums2.length);

        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        System.out.println("Sum = " + sum);

        int[] mas1 = {1,2,3,4,5};

        int[][] mas2 = {{1,2,3,4,5}, {1,2,3,4,5}};

        int[][][] mas3 = new int[2][3][4];

        for(int i = 0; i<mas3.length; i++) {
            System.out.println("1 уровень " + mas3[i]);
            for (int j = 0; j < mas3[i].length; j++) {
                System.out.println("    2 уровень " + mas3[i][j]);
                for (int k = 0; k < mas3[i][j].length; k++){
                    System.out.println("        3 уровень " + mas3[i][j][k]);
            }
        }}

        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i : array){
            System.out.println("Array " + i);
        }

        for (int i =0; i<array.length; i++){
            System.out.println("Arr " + array[i]);
        }

        for (int i=1; i<array.length; i=i+2){
            System.out.println("arr " + array[i]);
        }





    }

}
