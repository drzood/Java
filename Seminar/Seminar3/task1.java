package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
// import java.util.concurrent.ThreadLocalRandom;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();

        // ThreadLocalRandom.current().nextInt(1, 100);

        // int a = random.nextInt(10);
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(10));
        }
        list1.sort(Comparator.naturalOrder());
        for (Object x : list1) {
            System.out.print(x + " ");
        }
    }
}
