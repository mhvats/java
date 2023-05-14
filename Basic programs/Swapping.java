public class Swapping {
    static int swappingFunction(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %d\nb = %d\n", a, b);
        return (a);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        int value = swappingFunction(a, b);
        System.out.printf("Value of a after returning = %d", value);
    }

}
