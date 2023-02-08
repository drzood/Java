package Seminar.Seminar5.HomeWorke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
         * Реализуйте структуру телефонной книги с помощью HashMap,
         * учитывая, что 1 человек может иметь несколько телефонов.
         * 
         */
        book.put("Иван Иванов", List.of("79100044122", "79154488112"));
        book.put("Евгений Зюзин", List.of("79165121311", "79451549854"));
        book.put("Жанна Гага", List.of("79111656412", "79416511222"));

        int inp = 0;
        System.out.println("""
                    *** МЕНЮ ***
                1. Показать весь список;
                2. Добавить новый контакт;
                3. Удалить контакт;
                4. Завершить работу.
                """);
        while (inp != 4) {
            System.out.print("Введите от 1 до 4: ");
            inp = scan.nextInt();
            switch (inp) {
                case 1 -> allList();
                case 2 -> addNewAc();
                case 3 -> delAContact();
                case 4 -> scan.close();
            }
        }
    }

    public static Map<String, List<String>> book = new HashMap<>();
    public static Scanner scan = new Scanner(System.in);

    public static void allList() {
        for (String i : book.keySet()) {
            System.out.printf("%-20s", i);
            for (String j : book.get(i)) {
                System.out.print(j + "; ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addNewAc() {
        List<String> num = new ArrayList<>();
        int x = 1;
        System.out.println("Введите Имя и Фамилию: ");
        String name = scan.next();
        while (x != 2) {
            if (x == 1) {
                System.out.println("Введите номер телефона: ");
                String number = scan.nextLine();
                num.add(number);
            }
            System.out.print("Желаете добавить еще один номер (1 - Да/2 - Нет)?\n Ответ: ");
            x = scan.nextInt();
        }
        book.put(name, num);
    }

    public static void delAContact() {
        while (true) {
        System.out.print("Введите Имя и Фамилию для удаления: ");
        String name = scan.nextLine();
            if (book.keySet().contains(name)) {
                book.remove(name);
                System.out.printf("%s удален.\n", name);
                break;
            }
            else System.out.println("Данного персонажа не надено.");
        }
    }
}
