// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) 
// элементов массива должны быть отличны от 
// заданного, а остальные - равны ему

// Пример: 3 2 1 3 5 6
// Вывод: 2 1 5 6 3 3

package Seminar.Seminar1;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[] { 3, 2, 2, 3, 3, 5, 7, 6, 5, 3 };
        int[] resArr = new int[arr.length];
        int value = 3;
        int index = 0;
        for (int k : arr) {
            if (k != value) {
                resArr[index] = k;
                index++;
            }
        }
        for (int i = index; i < resArr.length; i++)
            resArr[i] = 3;
        for (int j : resArr)
            System.out.printf("%d", j);

        // Integer[] nums = new Integer[] {3,2,2,3,3,5,7,6,5,3};
        // Integer len = nums.length;
        // Integer[] newNums = new Integer[len];
        // Integer val = 3;
        // Integer offset = 0;

        // for (int i = 0; i < len; i++) {
        // if (nums[i] == val){
        // offset++;
        // newNums[len - offset] = nums[i];
        // }
        // else
        // newNums[i - offset] = nums[i];
        // }
        // for (int i = 0; i < newNums.length; i++) {
        // System.out.print(newNums[i]);

    }

}
