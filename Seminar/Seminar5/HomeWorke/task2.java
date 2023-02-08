package Seminar.Seminar5.HomeWorke;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        /*
         * Написать программу, которая найдет и выведет
         * повторяющиеся имена с количеством повторений.
         * Отсортировать по убыванию популярности Имени.
         * Иван Иванов
         * Светлана Петрова
         * Кристина Белова
         * Анна Мусина
         * Анна Крутова
         * Иван Юрин
         * Петр Лыков
         * Павел Чернов
         * Петр Чернышов
         * Мария Федорова
         * Марина Светлова
         * Мария Савина
         * Мария Рыкова
         * Марина Лугова
         * Анна Владимирова
         * Иван Мечников
         * Петр Петин
         * Иван Ежов
         */
        Map<String, Integer> list = new HashMap<>();
        String str = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] listPopular = str.split(" ");
        for (int i = 0; i < listPopular.length; i += 2) {
            if (list.containsKey(listPopular[i])) {
                list.replace(listPopular[i], list.get(listPopular[i]) + 1);
            } else {
                list.put(listPopular[i], 1);
            }
        }
        System.out.printf("\nСписок имен: %s\n", list);
        
        list.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
    }
}
