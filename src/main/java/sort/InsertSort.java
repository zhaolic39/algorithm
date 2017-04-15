package sort;

import java.util.Arrays;

/**
 * Created by Paully on 2017/4/13.
 */
public class InsertSort implements Sorting{

    @Override
    public void sort(Integer[] arr) {
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

    @Override
    public String getName() {
        return "InsertSort";
    }
}
