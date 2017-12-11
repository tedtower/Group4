import java.util.Scanner;

public class EternalImortallity{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		int last = 1;
		for (long i = a+1; last != 0 && i <= b; i++)
		{
			last *= i % 10;
			last %= 10;
		}
		System.out.println(last);
	}
}