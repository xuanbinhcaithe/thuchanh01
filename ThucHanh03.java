import java.util.Scanner;

public class ThucHanh03 {
    public static void main(String[] args) {

        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        width = sc.nextFloat();
        System.out.println("Enter heigh :");
        height = sc.nextFloat();

        float area = width*height;
        System.out.println("area = "+area);

    }


}
