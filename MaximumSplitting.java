import java.util.Scanner;

public class MaximumSplitting {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int num = 0;
		for(int i = 0; i < a; i++) {
			int k = kbd.nextInt();
			num = 0;
			if(k % 2 == 1) {
				k -= 9;
				num++;
			}if(k % 4 != 0) {
				k -= 6;
				num++;
			}
			num += k / 4;
			if(k < 0 | k % 4 != 0) {
				System.out.println(-1);
			} else {
				System.out.println(num);
			}
		}
	}
}