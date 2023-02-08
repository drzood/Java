package Seminar.Seminar5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        /*
         * Даны 2 строки, написать метод, который вернет true,
         * если эти строки являются изоморфными и false, если нет.
         * Строки изоморфны, если одну букву в первом слове можно
         * заменить на некоторую букву во втором слове, при этом
         * 
         * 1. повторяющиеся буквы одного слова меняются на одну и
         * ту же букву с сохранением порядка следования.
         * (Например, add - egg изоморфны)
         * 2. буква может не меняться, а остаться такой же. (Например,
         * note - code)
         * 
         * Пример 1:
         * Input: s = "foo", t = "bar"
         * Output: false
         * Пример 2:
         * Input: s = "paper", t = "title"
         * Output: true
         */
        // String str1 = "total";
        // String str2 = "paper";
        // char[] ch1 = str1.toCharArray();
        // char[] ch2 = new char[str2.length()];
        // for (int i = 0; i < str2.length(); i++) {
        // ch2[i] = str2.charAt(i);
        // }
        // boolean flag = true;
        // Map<Character, Character> db = new HashMap<>();
        // db.putIfAbsent(ch1[0], ch2[0]);
        // for (int i = 1; i < str1.length(); i++) {
        // if (db.containsKey(ch1[i]) && db.get(ch1[i]).equals(ch2[i]))
        // continue;
        // else if (!db.containsKey(ch1[i]) && db.containsValue(ch2[i]))
        // flag = false;
        // else if (!db.containsKey(ch1[i]))
        // db.put(ch1[i], ch2[i]);
        // else
        // flag = false;
        // }
        // System.out.println(flag);

        String str1 = "papera";
        String str2 = "titlet";
        Boolean prov = true;
        Map<Character, Character> dic = new HashMap<Character, Character>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (dic.containsKey(str1.charAt(i))) {
                    if (dic.get(str1.charAt(i)) != str2.charAt(i)) {
                        prov = false;
                    }
                } else {
                    if (dic.containsValue(str2.charAt(i))) {
                        prov = false;
                    }
                    dic.put(str1.charAt(i), str2.charAt(i));
                }
            }
        } else {
            prov = false;
        }
        System.out.println(prov);

    }
}
