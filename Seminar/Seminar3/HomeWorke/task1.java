package Seminar.Seminar3.HomeWorke;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        /*
         * Пусть дан произвольный список целых чисел, 
         * удалить из него четные числа.
         */
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(100));
        }    
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
