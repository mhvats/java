import java.util.Scanner;

public class MultipicationOfFolating {
    public static void main(String[] ars) {
        float number1, number2;
        Scanner scanner = new Scanner(System.in);
        number1 = Float.parseFloat(scanner.nextLine());
        number2 = Float.parseFloat(scanner.nextLine());
        System.out.println(number1 * number2);

        scanner.close();
    }
}
