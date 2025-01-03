package src;

import java.util.Scanner;


public class LabOne{
    public static void main(String[] args){

        System.out.println("Задача 1");

        Scanner consol = new Scanner(System.in);
        int r = consol.nextInt();
        if (r%2==0){
            System.out.println(r + " число четное");
        }
        else {
            System.out.println(r + " число нечетное");
        }


        System.out.println("Задача 2");

        System.out.print("a: ");
        int a = consol.nextInt();
        System.out.print("b: ");
        int b = consol.nextInt();
        System.out.print("c: ");
        int c = consol.nextInt();
        int discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0){
            int x = -b/(2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("нет решений");
        }


        System.out.println("Задача 3");

        System.out.println("1 число");
        double  a1 = consol.nextDouble();
        System.out.println("2 число");
        double  b1 = consol.nextDouble();
        System.out.println("3 число");
        double  c1 = consol.nextDouble();
        if ((a1>b1)&&(a1>c1)){
            System.out.println(a1 + " максимальное");
        }
        if ((b1>c1)&&(b1>a1)){
            System.out.println(b1 + " максимальное");
        }
        if ((c1>b1)&&(c1>a1)){
            System.out.println(c1 + " максимальное");
        }


        System.out.println("Задача 4");

        System.out.print("x: ");
        int  x = consol.nextInt();
        System.out.print("y: ");
        int  y = consol.nextInt();
        System.out.println( x%y==0? "первое число делится на второе без остатка" : x%y );
    }
}