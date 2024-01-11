import java.util.Scanner;
public class Tax{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nคนที่ = " + i);
        System.out.print("Input your income :");
        double income = sc.nextDouble();

        double money = 0.0;

        if (income <= 100000) {
            money = income * 0.05;
        } else if (income > 100000 && income <= 500000) {
            money = 100000 * 0.05 + (income - 100000) * 0.10;
        } else if (income > 500000 && income <= 1000000) {
            money = 100000 * 0.05 + 400000 * 0.10 + (income - 500000) * 0.20;
        } else if (income > 1000000 && income <= 4000000) {
            money = 100000 * 0.05 + 400000 * 0.10 + 500000 * 0.20 + (income - 1000000) * 0.30;
        } else {
            money = 100000 * 0.05 + 400000 * 0.10 + 500000 * 0.20 + 1000000 * 0.30 + (income - 4000000) * 0.37;
        }
        System.out.println("เสียภาษี :" + money);
        }
    }
}