package Lesson2;

public class Main {


    public static void main (String args[]) {

        System.out.println("Задание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxArr_3 = arr.length;
        for (int i = 0; i < maxArr_3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < maxArr_3; i++){
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        System.out.print(arr[i] + " ");

        }
        System.out.println("\n Задание 2");

        int[] arr_2 = new int[8];
        int d = 0;
        //int maxMass = arr_2.length;

        for (int i = 0; i <arr_2.length; i++, d = d + 3) {
            arr_2[i] = d;
            System.out.print(arr_2[i] + " ");
    }
        System.out.println("\n Задание 3");

        int[] arr_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxArr = arr_3.length;
        for (int i = 0; i < maxArr; i++) {
            if (arr_3[i] < 6) arr_3[i] = arr_3[i] * 2;
        }
        for (int i = 0; i < maxArr; i++) {
            System.out.print(arr_3[i]+" ");
        }
        System.out.println("\n Задание 4");
        int[][] arr_4 = new int[4][4];
        for (int i = 0; i < arr_4.length; i++) {
            for (int j = 0, x = arr_4[i].length - 1; j < arr_4[i].length; j++, x--) {
                if (i == j || i == x) arr_4[i][j] = 1;
                else arr_4[i][j] = 0;
                System.out.print(arr_4[i][j] + " ");
            }
            System.out.println();
        }
    }
}




