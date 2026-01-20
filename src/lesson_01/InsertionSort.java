package lesson_01;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1};

        sort(numbers);

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}