/*
 *Author: Aaron Quitoriano
 *
 * 867A - Between The Offices
 */

import java.util.Scanner;


public class BetweenTheOffices {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        String b= kbd.next();
        if(b.charAt(0)=='S'&& b.charAt(a-1)=='F'){

        	System.out.println("YES");
        }else{

        	System.out.println("NO");
  		  }
    }

}