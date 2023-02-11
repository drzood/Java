package Seminar.Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        /*
         * 1. Создайте HashSet, заполните его следующими числами:
         * {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
         * 
         * 2. Создайте LinkedHashSet, заполните его следующими числами:
         * {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
         */
        Set<Integer> nums = new HashSet<>(Arrays.asList(1, 2000, 3, 2, 4, 5, 6, 3));
        System.out.println(nums); // [2000, 1, 2, 3, 4, 5, 6] 

        var nums2 = new LinkedHashSet<>(Arrays.asList(1, 2000, 3, 2, 4, 5, 6, 3));
        System.out.println(nums2);  // [1, 2000, 3, 2, 4, 5, 6]

    }
}
