import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. vẽ hình tam giác");
        System.out.println("2. vẽ hình chữ nhật ");
        System.out.println("3.vẽ hình vuông");
        System.out.println("0.Exit");
        while (true) {
            System.out.println("Enter yout choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }

    }
}
