package Seminar.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
         * Реализовать консольное приложение, которое:
         * 1. Принимает от пользователя строку вида
         * text~num
         * 2. Нужно рассплитить строку по ~, сохранить
         * text в связный список на позицию num.
         * 3. Если введено print~num, выводит строку из
         * позиции num в связном списке и удаляет её из списка.
         */
        LinkedList<String> text = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            // while (!line.equalsIgnoreCase("stop")) интересно | переменная String line =
            // "";

            String input = iScanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] string = input.split("~");
            if (string[0].equals("print")) {
                System.out.println(text.remove(Integer.parseInt(string[1])));
            } else {
                text.add(Integer.parseInt(string[1]), string[0]);
            }
        }
        iScanner.close();
    }
}