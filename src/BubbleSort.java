import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] numbers) {
        if (numbers == null)
            return numbers;
        boolean numbersSwapped;
        do {
            numbersSwapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int aux = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = aux;
                    numbersSwapped = true;
                }
            }
        } while (numbersSwapped);

        return numbers;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSorter = new BubbleSort();
        int[] lista = {7, 9, 1, 4, 9, 12, 4, 13, 9};
        int[] result = bubbleSorter.bubbleSort(lista);
        System.out.println(Arrays.toString(result));

    }
}
