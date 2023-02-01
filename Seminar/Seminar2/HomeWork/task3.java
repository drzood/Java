package Seminar.Seminar2.HomeWork;

import java.util.Scanner;
import java.lang.StringBuffer;

public class task3 {
    public static void main(String[] args) {
        /*
         * Напишите метод, который принимает на вход строку (String)
         * и определяет является ли строка палиндромом (возвращает boolean значение).
         */
        System.out.println("введите строку");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();
        String reversedString = new StringBuffer(str).reverse().toString();

        if (str.equals(reversedString)) 
            System.out.println("строка является полиндромом");
        else
            System.out.println("строка является не полиндромом");
    }
}
