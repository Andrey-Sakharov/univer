package src;

import java.util.Random;
import java.util.Arrays;

public class labtwo {
    public static void main(String[] args) {

        System.out.println("Task1");

        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("Task2");

        Random rnd2 = new Random();
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rnd2.nextInt(-100, -100);
        }
        System.out.println(Arrays.toString(array2));
        int max = 0;

        for (int i : array2) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);


        System.out.println("Task3");

        Random rnd3 = new Random();
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = rnd3.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array3));
        int c = 0;
        for (int i : array3) {
            if (i % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);


        System.out.println("Task4");

        Random rnd4 = new Random();
        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = rnd4.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array4));

        int felem = array4[0];
        array4[0] = array4[array4.length - 1];
        array4[array4.length - 1] = felem;
        System.out.println(Arrays.toString(array4));


        System.out.println("Task5");

        Random rnd5 = new Random();
        int[] array5 = new int[10];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = rnd5.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array5));
        int sumelem = 0;
        for (int i : array5){
            sumelem += (int)i;
        }
        System.out.println(sumelem/array5.length);
    }
}