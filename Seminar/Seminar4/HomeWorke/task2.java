package Seminar.Seminar4.HomeWorke;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
         * Реализуйте очередь с помощью LinkedList со следующими методами:
         * enqueue() - помещает элемент в конец очереди,
         * dequeue() - возвращает первый элемент из очереди и удаляет его,
         * first() - возвращает первый элемент из очереди, не удаляя.
         * newList()
         */
        Scanner inp = new Scanner(System.in);

        // System.out.println(ll);
        int x = 0;

        while (x != 5) {
            System.out.println("""
                        *** MENU ***
                    1. Показать список;
                    2. Переместить элемент в конец списка;
                    3. Показать и удалить первый элемент;
                    4. Показать первый элемент из очереди;
                    5. Завершить работу.
                    """);
            System.out.print("Введите от 1 до 5: ");
            x = inp.nextInt();
            switch (x) {
                case 1 -> System.out.println(ll);
                case 2 -> {
                    System.out.printf("Выберите и введите элемент для перемещения\n%s\n", ll);
                    String y = inp.next();
                    enqueue(y);
                    System.out.println(ll);
                }
                case 3 -> System.out.println(dequeue());
                case 4 -> System.out.println(first());
            }
        }
        inp.close();

    }

    public static LinkedList<String> ll = new LinkedList<>();

    public static void enqueue(String y) {
        ll.addLast(y);
    }

    public static String dequeue() {
        return ll.pop();
    }

    public static String first() {
        return ll.getFirst();
    }
}
