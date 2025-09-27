public class BubbleSortExample {
    static void bubbleSort(int[] InputArray) {
        int n = InputArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(InputArray[j-1] > InputArray[j]){
                    //swap elements
                    temp = InputArray[j-1];
                    InputArray[j-1] = InputArray[j];
                    InputArray[j] = temp;
                }
            }
        }
    }
}