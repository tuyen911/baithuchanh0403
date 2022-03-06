import java.util.Scanner;

public class app74 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = 0;
            //tinh tong cac so chan
            for (int i = 0; i <= n; i++) {
            	if (i % 2 != 0) {
            		a += i;
            	}
            }
            System.out.println(a);
        }
	}
}