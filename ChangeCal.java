import java.util.Scanner;

public class ChangeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ราคาสินค้า: ");
        double price = sc.nextDouble();
        System.out.print("เงินที่จ่าย: ");
        double payment = sc.nextDouble();

        double change = payment - price;

        int[] money = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        System.out.println("เงินทอน: " + change + " บาท");
        System.out.println("แบงค์และเหรียญที่ใช้ทอน:");

        for (int moneys : money) {
            int count = (int) (change / moneys);
            if (count > 0) {
                change %= moneys;
                if (moneys >= 20) {
                    System.out.println("ธนบัตร " + moneys + " บาท: " + count + " ใบ");
                } else {
                    System.out.println("เหรียญ " + moneys + " บาท: " + count + " เหรียญ");
                }
            }
        }
    }
}