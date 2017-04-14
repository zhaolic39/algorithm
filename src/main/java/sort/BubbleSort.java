package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * Created by Zhao Li on 2017/4/14.
 */
public class BubbleSort implements Sorting{
    @Override
    public void sort(Integer[] array) {
        for(int i=0;i<array.length;i++){
            int k = array[0];
            for(int j=1;j<array.length-i;j++){
                if(k > array[j]){
                    array[j -1] = array[j];
                    array[j] = k;
                }
                else{
                    k = array[j];
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
