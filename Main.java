import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello java! Enter Your age : ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nice to know you are "+ number);

        scanner.close();
    }
}