import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter no.");
        int a = n.nextInt();

        for (int i = 1; i <= 10; i++) {
            int b = a*i;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
