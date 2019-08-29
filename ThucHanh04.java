import java.util.Scanner;

public class ThucHanh04 {

    public static void main(String[] args) {

        System.out.println("Liner Equation Resoleve ");
        System.out.println("Given a equation as 'a*x + b = c' ,please enter constans ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a :");
        float a = scanner.nextFloat();
        System.out.println("b : ");
        float b = scanner.nextFloat();
        System.out.println("c : ");
        float c = scanner.nextFloat();

        if (a != 0) {
            float x = (c-b)/a;
            System.out.printf("The solution is %f!",x);
        }else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
