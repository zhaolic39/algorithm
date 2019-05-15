package sort;

public class HeapSort implements Sorting{
    @Override
    public void sort(Integer[] nums) {
        int[] heap = new int[nums.length + 1];

        for(int i=0;i<nums.length;i++){
            heap[i+1] = nums[i];
        }

        for(int i = nums.length/2;i>0;i--){
            // 遍历k/2为每个非叶子节点
            sort(heap, i, heap.length);
//            System.out.println(Arrays.toString(heap));
        }

        for(int i = 1;i<heap.length;i++){
            nums[i - 1] = heap[1];
            heap[1] = heap[heap.length - i];
            sort(heap, 1, heap.length - i);
        }
    }

    public void sort(int[] heap, int index, int heapSize){
//         System.out.println(heapSize);
        int min = index;
        if(heapSize>(index*2) && heap[min] > heap[index*2]){
            // swap(heap, index, index*2);
            min = index*2;
        }

        if(heapSize>(index*2 +1) && heap[min] > heap[index*2 +1]){
            min = index*2 +1;
        }

        if(min == index) return;

        swap(heap, min, index);
        sort(heap, min, heapSize);
    }

    public void swap(int[] heap, int left, int right){
        int tmp = heap[left];
        heap[left] = heap[right];
        heap[right] = tmp;
    }

    @Override
    public String getName() {
        return "HeapSort";
    }
}
