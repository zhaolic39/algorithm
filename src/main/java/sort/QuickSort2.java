package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhao Li on 2017/4/14.
 */
public class QuickSort2 implements Sorting{
    @Override
    public void sort(Integer[] array) {
        Integer[] a = quick2(array);
        for(int i=0;i<array.length;i++){
            array[i] = a[i];
        }
    }

    @Override
    public String getName() {
        return "QuickSort2";
    }

    public static Integer[] quick2(Integer[] arr){
        if(arr.length <= 1) return arr;

        int k = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            if(arr[i]<k){
                left.add(arr[i]);
            }
            else{
                right.add(arr[i]);
            }
        }
        Integer[] l = quick2(toIntArray(left));
        Integer[] r = quick2(toIntArray(right));
        List<Integer> result = new ArrayList<>();

        for(int i:l){
            result.add(i);
        }
        result.add(k);
        for(int i:r){
            result.add(i);
        }

        return toIntArray(result);
    }

    private static Integer[] toIntArray(List<Integer> list){
        Integer[] l = new Integer[ list.size()];
        for(int i=0;i<list.size();i++){
            l[i] = list.get(i);
        }
        return l;
    }
}
