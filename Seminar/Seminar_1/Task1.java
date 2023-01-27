//Написать программу, которая запросит пользователя ввести 
// <Имя> в консоли. Получит введенную строку и выведет в консоль 
// сообщение “Привет, <ИмяНаписать программу, которая запросит 
// пользователя ввести <Имя> в консоли. Получит введенную строку 
// и выведет в консоль сообщение “Привет, <Имя

package Seminar.Seminar_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "Cp866");
        System.out.printf("name: ");
        String name = input.nextLine();
        System.out.printf("Привет, %s!", name);
        input.close();
    }
}
 