import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
        /* --- SELECTION SORT --- */
        int[] arr1 = {-232, 23, 6, 8, 1, 40,10, 7, -50670, 2, 655, 4, 3, -400, 0, 5, 123, 9};
        System.out.println(arr1.length);
        Sort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        /* --- INSERTION SORT --- */
        int[] arr2 = {-232, 23, 6, 8, 1, 40,10, 7, -50670, 2, 655, 4, 3, -400, 0, 5, 123, 9};
        System.out.println(arr2.length);
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
