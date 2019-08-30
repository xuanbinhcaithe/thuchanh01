import java.util.Scanner;

public class ChiSoCanNang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight ,height , bmi;
        System.out.println("weight :");
        weight = scanner.nextDouble();

        System.out.println("height : ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","InterPretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        }else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s",bmi,"Nnrmal");
        }else if (bmi < 30 ) {
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }else {
            System.out.printf("%-20.2f%s",bmi,"Obese");
        }



    }
}
