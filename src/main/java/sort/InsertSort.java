package sort;

import java.util.Arrays;

/**
 * Created by Paully on 2017/4/13.
 */
public class InsertSort {

    public static void sort(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                int k = arr[i];
                int j = i;
                while(j>0 && k<arr[j-1]){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = k;
            }
            System.out.println(Arrays.toString(arr));
            i++;
        }
    }

    public static void main(String[] args){
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
