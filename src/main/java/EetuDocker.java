import java.util.Scanner;

public class EetuDocker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + ", Docker!");
        scanner.close();
    }
}
