// Not able to find Unknown key
class binarySearch {
    int Binarysearch(int array[], int key) {
        int left = 0, right = array.length;
        while (left <= right) {
            int middle = left + (right - 1) / 2;

            if (array[middle] == key)
                return middle;
            else if (array[middle] < key)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 10, 20, 30, 40, 50 };
        binarySearch obj = new binarySearch();
        int res = obj.Binarysearch(array, 100);
        System.out.print(res);
    }
}