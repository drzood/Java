package Seminar.Seminar_1.HomeWorke;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        /*
         * Вычислить n-ое треугольного число(сумма чисел от 1 до n),
         * n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
         */
        Scanner input = new Scanner(System.in); // берем данные из консоли
        System.out.printf("n = "); // 
        int n = input.nextInt();
        input.close();
        if (n > 0){
            System.out.print(n + "t" + " = ");
            for (int i = 1; i < n; i++) {
                System.out.print(i + " + ");
            }
            System.out.print(n + "\n");

            System.out.print(n + "!" + " = ");
            for (int i = 1; i < n; i++) {
                System.out.print(i + " * ");
            }
            System.out.print(n);
        }
        else    System.out.println("Что-то пошло не так.");
    }
}
