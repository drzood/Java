package Seminar.Seminar2.HomeWork;

import java.io.*;

public class task2 {
    /*
     * Дана json строка (прочитать и сохранить в файл).
     * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
     * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
     * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
     * Написать метод(ы), который распарсит json и используя StringBuilder,
     * создаст строки вида: Студент [фамилия] получил [оценка] по предмету
     * [предмет].
     * Пример вывода:
     * Студент Иванов получил 5 по предмету Математика.
     * Студент Петрова получил 4 по предмету Информатика.
     * Студент Краснов получил 5 по предмету Физика.
     */
    public static void main(String[] args) throws Exception {
        String[] arrayData = ReadLineFromFile("Seminar/Seminar2/HomeWork/task2.json");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }

    }

    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String[] arrayData = line5.split(",");
        String[] listName = { "Студент ", " получил ", " по предмету " };
        for (int i = 0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]).append(arrData[1]);
        }
        return result;
    }

    // Считывание строк с файла
    public static String[] ReadLineFromFile(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = br.readLine();
        System.out.println(str);
        String[] listData = str.split("},\\{");
        br.close();
        return listData;

    }

}