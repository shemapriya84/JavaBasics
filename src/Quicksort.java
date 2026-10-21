import java.util.Arrays;

class Quicksort {

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low + 1;
        int j = high;

        while (i <= j) {

            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {

        int[] arr = {19, 7, 15, 12, 16, 18, 4, 11};

        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}