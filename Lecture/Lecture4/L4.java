// package Lecture.Lecture4;

import java.util.LinkedList;
import java.util.Queue;

public class L4 {
    public static void main(String[] args) {
        /*
         * LinkedList
         * Представляет собой двусвязный список.
         * Список – гибкая структура данных, позволяющая легко менять свой
         * размер. Элементы доступны для вставки или удаления в любой позиции.
         * 
         * LinkedList нужен для небольшого количества
         * элементов, в которых операции добавления\удаления
         * встречаются чаще операций чтения.
         */
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(2);
        
        /*
         * Queue
         * 
         */
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(3);
        queue.add(3);
        int item = queue.remove();

        /*
         * PriorityQueue
         * Наивысший приоритет имеет «наименьший» элемент.
         */
    }
}
