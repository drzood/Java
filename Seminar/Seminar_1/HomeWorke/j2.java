package Seminar.Seminar_1.HomeWorke;

public class j2 {
    public static void main(String[] args) {
        /* Вывести все простые числа от 1 до 1000 */
        System.out.print("2 3 ");
        for (int i = 4; i < 1001; i++){
            if (i % 2 == 0 || i % 3 == 0 )   continue;
            else System.out.print(i + " ");
        }
    }
}

