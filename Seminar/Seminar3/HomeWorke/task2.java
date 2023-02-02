package Seminar.Seminar3.HomeWorke;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        /*
         * Задан целочисленный список ArrayList. Найти минимальное,
         * максимальное и среднее ариф. из этого списка
         */
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(10));
        }
        System.out.print(list);
        int max = list.get(0);
        int min = list.get(0);
        double avg = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i))  max = list.get(i);
            if (min > list.get(i))  min = list.get(i);
            avg += list.get(i);
        }
        System.out.printf("\n max = %s\n min = %s\n mean = %s", max, min, avg / list.size());
    }
}
