package sort;

import java.util.Arrays;

/**
 * 选择排序
 * Created by Zhao Li on 2017/4/15.
 */
public class SelectionSort implements Sorting {
    @Override
    public void sort(Integer[] array) {
        for(int i=0;i<array.length;i++){
            int k = array[i];
            int m = i;
            for(int j = i;j<array.length;j++){
                if(array[j] < k){
                    k = array[j];
                    m = j;
                }
            }
            array[m] = array[i];
            array[i] = k;
            System.out.println(Arrays.toString(array));
        }
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
