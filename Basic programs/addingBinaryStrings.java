public class addingBinaryStrings {
    static void binaryAdding(String x, String y) {
        int m = Integer.parseInt(x, 2);
        int n = Integer.parseInt(y, 2);
        System.out.print(m+n);
    }

    public static void main(String[] args) {
        String x = "011011", y = "1010111";
        binaryAdding(x, y);
    }

}
