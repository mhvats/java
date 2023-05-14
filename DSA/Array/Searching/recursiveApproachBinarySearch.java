// Not able to find unknown key

public class recursiveApproachBinarySearch {

    int binarySearch(int array[], int key, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key)
                return middle;
            else if (array[middle] < key)
                return binarySearch(array, key, left, middle + 1);
            else
                return binarySearch(array, key, left, middle - 1);
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 10, 20, 30, 40, 50 };
        int left = 0, right = array.length;
        recursiveApproachBinarySearch obj = new recursiveApproachBinarySearch();
        int res = obj.binarySearch(array, 10, left, right - 1);

        System.out.print(res);
    }
}
