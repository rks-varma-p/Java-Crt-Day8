import java.util.Scanner;

public class RahulPromotion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt(); 
        int max = 0;

        for (int i = 0; i < size; i++) {
            int commission = sc.nextInt();
            if (commission > max) {
                max = commission;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
