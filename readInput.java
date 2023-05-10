import java.util.Scanner;

public class readInput {
    public static void main(String[] args){
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(scannner.nextLine());
        System.out.print(number);

        scannner.close();
    }
}
