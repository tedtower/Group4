/*
 *Author: Aaron Quitoriano
 *
 * 859B- Lazy Security Guard
 */

 import java.util.*;


 public class LazySecurityGuard{

 	public static int a;
 	public static int sqrt;
	private static Scanner kbd;
 	public static void main(String [] args){
 		try{
 			getInput();
 			sqrt = (int) Math.sqrt(a);
 			if (sqrt * sqrt == a) {
 				System.out.println(equal());
			} else if (sqrt * (sqrt + 1) >= a) {
				System.out.println(greater());
			} else {
				System.out.println(less());
			}
 		}catch(Exception a){
			System.out.println("Exception!");
 		}



 	}

 	public static int getInput(){
 		kbd = new Scanner(System.in);
 		a = kbd.nextInt();
 		return a;

 	}
 	
 	public static int equal(){
 		return sqrt * 4;
 	}
 	public static int greater(){
 		return (2* (sqrt + sqrt + 1));
 	}
 	public static int less(){
 		return ((sqrt + 1) * 4 );
 	}
 	






 }