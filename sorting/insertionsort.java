public class insertionsort{

    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        
        for (int i = 1; i < n; i++) {

            int key = arr[i];      // element to be placed
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 90, 7, 100, 98, 88};

        InsertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
