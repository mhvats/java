public class Neon {
    static int rem, mod, n;

    public static void main(String args[]) {
        int num = 9;
        int a = num*num;
        while (a != 0) {
            mod = a % 10;
            n += mod;
            rem = a / 10;
            a = rem;
            // mod = 0;
        }
        System.out.println(n);
        if(n == num){
            System.out.print("Neon");
        }
        else{
            System.out.print("Not Neon");
        }
    }
}
