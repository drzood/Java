package Seminar.Seminar4.HomeWorke;

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        /*
         * Пусть дан LinkedList с несколькими элементами.
         * Реализуйте метод(не void), который вернет
         * “перевернутый” список.
         */
        LinkedList<Integer> ll = fillInTheList();
        LinkedList<Integer> llNew = flipTheList(ll);

        System.out.println(ll);
        System.out.println(llNew);
    }

    public static LinkedList<Integer> fillInTheList() {
        Random rand = new Random();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(rand.nextInt(10));
        }
        return ll;
    }

    public static LinkedList<Integer> flipTheList(LinkedList<Integer> ll) {
        LinkedList<Integer> llNew = new LinkedList<>();
        int j = ll.size() - 1;
        for (int i = 0; i < ll.size(); i++) {
            llNew.add(ll.get(j--));
            // ll.add(ll.size()-i-1, ll.pop());

        }
        return llNew;
    }
}
