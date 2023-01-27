package Seminar.Seminar_1.HomeWorke;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        /* Реализовать простой калькулятор 
        Scanner sc = ... 
        int a = sc.nextLine int b = sc.nextLine */
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("symbol: ");
        char s = input.next().charAt(0);
        System.out.print("b = ");
        int b = input.nextInt();
        input.close();
        int result = 0;
        switch (s){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a + b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Операция не распознана");
            }
        System.out.printf("\n%s %s %s = %s", a, s, b, result);

    }
}
