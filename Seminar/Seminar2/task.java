package Seminar.Seminar2;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        /*
         * Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N,
         * которая состоит из чередующихся символов c1 и
         * c2, начиная с c1.
         */
        // Scanner input = new Scanner(System.in, "CP866");
        // System.out.print("N = ");
        // int n = input.nextInt();
        // System.out.print("C1 = ");
        // char c1 = input.next().charAt(0);
        // System.out.print("C2 = ");
        // char c2 = input.next().charAt(0);

        // input.close();

        // System.out.print(Concat(n, c1, c2));
        // }

        // public static String Concat(int n, char a, char b) {
        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < n / 2; i++) {
        // sb.append(a);
        // sb.append(b);
        // }
        // return sb.toString();
        // }

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter N, c1, c2: ");
        String str = iScanner.nextLine();
        iScanner.close();
        String[] arr = str.split(" |,|\\.");

        System.out.println(charString(arr));
    }

    public static String charString(String[] arr) {

        int number = Integer.parseInt(arr[0]);
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < number / 2; i++) {
            string.append(arr[1]).append(arr[2]);
        }
        return string.toString();
    }

}
