package Seminar.Seminar2.HomeWork;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) throws IOException {
        /*
         * Реализовать простой калькулятор
         * Scanner sc = ...
         * int a = sc.nextLine int b = sc.nextLine
         * К калькулятору из предыдущего дз добавить логирование.
         */
        Logger log = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("Seminar/Seminar2/HomeWork/task4Log.txt", true);
        log.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        log.info("a = " + a);

        System.out.print("symbol: ");
        char s = input.next().charAt(0);
        log.info("Sybol: " + s);

        System.out.print("b = ");
        int b = input.nextInt();
        log.info("b = " + b);
        input.close();

        int result = 0;

        switch (s) {
            case '+':
                result = a + b;
                log.info(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                log.info(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                log.info(a + " * " + b + " = " + result);
                break;
            case '/':
                result = a / b;
                log.info(a + " / " + b + " = " + result);
                break;
            default:
                log.info("Операция не распознана.");
                System.out.println("Операция не распознана.");
        }
        System.out.printf("\n%s %s %s = %s", a, s, b, result);

    }
}