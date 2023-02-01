package Seminar.Seminar2.HomeWork;

import java.io.IOException;
import java.util.logging.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        /*
         * Реализуйте алгоритм сортировки пузырьком числового массива,
         * результат после каждой итерации запишите в лог-файл.
         */
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("Seminar/Seminar2/HomeWork/Task1Log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] arr = { 2, 5, 4, 9, 1, 3, 8, 6, 7, 1 };

        try {
            for (int i = 0; i < arr.length; i++) {
                int x;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        logger.info("Переставление индексов " + j + " и " + (j + 1));
                        x = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = x;
                    }
                }
            }
        } catch (Exception e) {
            logger.warning("Что-то пошло не так.");        
        } finally {
            for (int i : arr)   System.out.print(i);
        }
    }
}