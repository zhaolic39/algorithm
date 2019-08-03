package sort2;

import sort.Sorting;

public class BubbleSort2 implements Sorting {
    @Override
    public void sort(Integer[] array) {
        for(int i = 0 ;i <array.length;i++){


            for(int j = i + 1;j<array.length;j++){
                int m = array[i];
                int n = array[j];

                if(n < m){
                    array[i] = n;
                    array[j] = m;
                }
            }

        }
    }

    @Override
    public String getName() {
        return "BubbleSort2";
    }
}
