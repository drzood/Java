package Seminar.Seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        /*
         * 1. Напишите метод, который заполнит массив из 1000 элементов
         * случайными цифрами от 0 до 24.
         * 
         * 2. Создайте метод, в который передайте заполненный выше массив 
         * и с помощью Set вычислите процент уникальных значений в данном 
         * массиве и верните его в виде числа с плавающей запятой.
         * 
         * Для вычисления процента используйте формулу:
         * 
         * процент уникальных чисел = количество уникальных чисел * 100 / общее
         * количество чисел в массиве.
         */
        // System.out.println(fillArray());
        ArrayList<Integer> arr = fillArray();
        System.out.println(percentUniq(arr));
    }

    static public ArrayList<Integer> fillArray() {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) 
            arr.add(rand.nextInt(25));
        return arr;
    }

    public static Float percentUniq(ArrayList<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        return (float) (set.size() * 100/ (float)arr.size());
    }
}
