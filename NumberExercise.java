package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class NumberExercise {
    public static int[] importData(int[] array) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = keyboard.nextInt();
        }
        return array;
    }
    
    public static void printData(int[] array) {
        System.out.println("Mang vua nhap la: " + Arrays.toString(array));
    }
    
    public static int findMax2(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            }else if (array[i] > max2 && array[i] < max1) {
                max2 = array[i];
            }
        }
        return max2;
    }
    
    public static void deleteOddNumber(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }
        System.out.println("Mang sau khi xoa cac so le la: " + list);
    }
}
    




    


