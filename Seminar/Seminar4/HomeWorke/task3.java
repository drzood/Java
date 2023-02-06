package Seminar.Seminar4.HomeWorke;

import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
         * В калькулятор добавьте возможность отменить последнюю операцию.
         * 1+2=3+4=7 отмена =3
         */
        LinkedList<Integer> result = new LinkedList();
        result.add(0);
        Scanner input = new Scanner(System.in);
        String x = "yes";
        int a = 1;

        while (!x.equals("no")) {

            if (x.equals("cancel")) {
                result.remove(0);
                System.out.print("Желаете продолжить (yes/no/sansel): ");
                x = input.next();
            } else if (x.equals("yes")) {
                if (a != result.get(0)) {
                    System.out.print("a = ");
                    a = input.nextInt();
                } else {
                    System.out.printf("a = %s\n", a);
                }
                System.out.print("symbol: ");
                char s = input.next().charAt(0);
                System.out.print("b = ");
                int b = input.nextInt();
                switch (s) {
                    case '+' -> result.addFirst(a + b);
                    case '-' -> result.addFirst(a - b);
                    case '*' -> result.addFirst(a * b);
                    case '/' -> result.addFirst(a / b);
                    default -> System.out.println("Операция не распознана");
                }
                System.out.printf("%s %s %s = %s\n", a, s, b, result.get(0));
                a = result.get(0);
                System.out.print("Желаете продолжить (yes/no/cancel): ");
                x = input.next();
            } else {
                System.out.print("Желаете продолжить (yes/no/sansel): ");
                x = input.next();
            }
        }
        input.close();
    }
}
