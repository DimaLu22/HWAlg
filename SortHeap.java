
public class SortHeap {

    public static void Sort(int[] arr){
        for(int i = arr.length/2 - 1; i >= 0; i--)
            heap(arr, i, arr.length);

        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heap(arr, 0, i);
        }

    }
    private static void heap(int[] arr, int root, int n){
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int largest  = root;

        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;
        if(root != largest){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heap(arr, largest, n);
        }
    }

    public static void main(String[] args) {
            int[] array = {23, 12, 234, 432, 1000, 5, 8, 9, 10, -5, -8, -34, 123, 457, -1000};
            Sort(array);
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
    }
}