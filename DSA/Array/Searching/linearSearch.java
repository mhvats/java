class linearSearch {
    public static int search(int arr[], int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)

                return i;
        }
        return -1;

    }

    public static void main(String args[]) {
        int array[] = { 10, 20, 30, 40, 50, 60, 70 };
        int res = search(array, 20);
        System.out.print(res);
    }
}

