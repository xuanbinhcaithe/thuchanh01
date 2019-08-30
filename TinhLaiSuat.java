import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 1;
        double money = 1.0;
        double interset_rate = 1.0;

        month = scanner.nextInt();
        money = scanner.nextDouble();
        interset_rate = scanner.nextDouble();

        double total_interset = 0;
        for (int i = 0; i<month;i++) {
            total_interset = money*(interset_rate/100)/12*3;
        }
        System.out.println("Total of interset : "+ total_interset);


    }
}
