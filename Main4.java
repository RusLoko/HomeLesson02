package Lesson2;


public class Main4 {

public static void main(String[] args) {
    int[][] arr = new int[4][4];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
            if (i == j || i == x) arr[i][j] = 1;
            else arr[i][j] = 0;
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}




