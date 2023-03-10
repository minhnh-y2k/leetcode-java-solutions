import java.util.Scanner;

/*
Một điểm KARAOKE tính tiền khách hàng theo công thức sau:
- Mỗi giờ trong 3 giờ đầu tiên tính 30000 đồng/giờ.
- Mỗi giờ tiếp theo có đơn giá giảm 30% so với đơn giá trong 3 giờ đầu tiên.
Viết chương trình Java nhập vào giờ bắt đầu, giờ kết thúc và in ra số tiền khách hàng phải trả biết rằng 8 <= giờ bắt đầu < giờ kết thúc <= 24.
 */
public class KaraokeBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start hour: ");
        int startHour = sc.nextInt();
        System.out.print("Enter end hour: ");
        int endHour = sc.nextInt();

        double bill = 0;

        if (startHour < 8 || startHour >= endHour || endHour > 24) {
            System.out.println("Invalid input");
        } else {
            int hours = endHour - startHour;
            bill = Math.min(hours, 3) * 30000 + Math.max(hours - 3, 0) * 30000 * 0.7;
            System.out.println("Bill: " + bill);
        }
    }
}
