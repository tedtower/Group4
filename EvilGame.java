/*
 *Problem 862A Mahmoud and Ehab and the MEX
 *@author Carla
 */
import java.util.Scanner;

public class EvilGame{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int number = input.nextInt();
		int mex = input.nextInt();
		int answer = 0;
		for (int i=0; i<number; i++) {
			int chosenNum = input.nextInt();
			if (chosenNum < mex) {
				answer++;
			}
			if (chosenNum == mex) {
				answer--;
			}
		}
		System.out.println(mex-answer);
	}

}