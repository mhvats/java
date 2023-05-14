// IN this method, we are searching the element by putting it to the last index of the array 
public class sentinalLinearSearch {
    public static int sentialSearch(int array[], int size, int key) {
        int last = array[size - 1];
        array[size - 1] = key;
        int i = 0;
        while (array[i] != key) {

            i++;
        }

        array[size - 1] = last;

        if ((i < (size - 1)) || (array[size - 1] == key)) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        int array[] = { 10, 20, 30, 40, 50 };
        int res = sentialSearch(array, array.length, 30);

        System.out.print(res);
    }
}
