/**
 *Problem 854A Fraction
 *@author Carla
 */
import java.util.*;

public class Fraction {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		double numerator = 0;
		double denominator = 1;
		for(double nume = 1; nume <= num / 2; nume++) {
			double denom = num - nume;
			if( (gcd((int)nume, (int)denom) == 1) && (nume / denom > numerator / denominator)) {
				numerator = nume;
				denominator = denom;
			}
		}
		System.out.println((int)numerator + " " + (int)denominator);
	}

	public static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
}