// sort the given array because, without sorting below algorithm will not be
// capable to perfom index[0] operation
import java.util.Arrays;

public class largestOfTwoNumbersInArray {
    int search(int array[]) {
        Arrays.sort(array);
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            // System.out.print(array[i]);
            int j = i;
            if (array[i] < array[j + 1]) {
                // System.out.print(array[j + 1]);
                if (max > array[j + 1])
                    continue;
                else
                    max = array[j + 1];
            }
        }
        // System.out.print(max);
        return max;
    }

    public static void main(String args[]) {
        int array[] = { 60, 10, 30, 40 };
        largestOfTwoNumbersInArray obj = new largestOfTwoNumbersInArray();
        int res = obj.search(array);
        System.out.print(res);
    }
}
