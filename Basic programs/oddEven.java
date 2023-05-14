public class oddEven {
    public static String check(int a){
        if(a%2 == 0){
            return "Even Number";
        }else{
            return "Odd Number";
        }
    }
    public static void main(String args []){
        String s = check(0);
        System.out.print(s);
    }
}
