package Seminar.Seminar4;

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        /*
         * Реализовать консольное приложение, которое:
         * 1. Принимает от пользователя и “запоминает” строки.
         * 2. Если введено print, выводит строки так, чтобы последняя
         * введенная была первой в списке, а первая - последней.
         */
        Stack<String> stack = new Stack<>();
        Scanner iScanner = new Scanner(System.in);

        while (true) {
            String text = iScanner.nextLine();
            if (text.equals("print")) {
                while (!stack.empty()) {
                    System.out.println(stack.pop() + " ");
                }
                break;
            }
            stack.push(text);
        }
        iScanner.close();

        // Stack<String> stack = new Stack<>();
        // Scanner iScanner = new Scanner(System.in);

        // while (true)
        // {
        // String text = iScanner.nextLine();
        // if (text.equals("print"))
        // {
        // int size = stack.size();
        // for (int i = 0; i < size; i++)
        // {
        // System.out.print(stack.pop() + " ");
        // }
        // break;
        // }
        // stack.push(text);
        // }
        // iScanner.close();
        // }
        // static void Zadacha4()
        // {
        // System.out.println("3 задача др решение");
        // Scanner scan= new Scanner(System.in);
        // Stack<String> stack = new Stack<>();

        // String str = "";

        // while (!str.equals("print")){
        // System.out.println("Введите строку: ");
        // str = scan.nextLine();
        // if (!str.equals("print")) {
        // stack.push(str);
        // }
        // }
        // scan.close();
        // while (!stack.empty()) {
        // System.out.print(stack.pop() + " ");
        // }
    }
}
