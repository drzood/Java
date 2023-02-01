// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Seminar.Seminar1;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,0,1,1,1,0,1,1};
        int count = 0;
        int max_count = 0;

        for(Integer i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)    ++count;
            else{
                if (count > max_count) max_count = count;
                count = 0;
            }
        }
        if (count > max_count)  max_count = count;
        System.out.println(count);
    }
}
