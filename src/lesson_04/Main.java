package lesson_04;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {9, 2, 7, 1, 8, 3, 6, 4, 5};

        int[] sorted = MergeSort.mergeSort(numbers);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
