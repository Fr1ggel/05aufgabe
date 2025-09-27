public class BubbleSortExample {
    static void bubbleSortInt(int[] InputArray) {
        int n = InputArray.length;
        int temp;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 1; j < (n - i); j++) {
                if (InputArray[j - 1] > InputArray[j]) {
                    // swap elements
                    temp = InputArray[j - 1];
                    InputArray[j - 1] = InputArray[j];
                    InputArray[j] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}