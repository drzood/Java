package Seminar.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();
        System.out.println(System.currentTimeMillis());
        long timeStart = System.currentTimeMillis(); // long может хранить болшее кол-во чем int
        // int long -еще больши объем
        // unsigned long - самы большой объем из положительных чисел
        for (int i = 0; i < 100000; i++){
            arList.add(i);
        }
        long timeFinish = System.currentTimeMillis();

        System.out.println(timeFinish - timeStart);
        System.out.println("--------------");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            linList.add(i);
        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
