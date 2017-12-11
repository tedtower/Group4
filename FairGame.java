/**
 * @(#)FairGame.java
 *
 *Problem 864A Fair Game
 * @author Carla
 * @version 1.00 2017/12/11
 */

public class FairGame {
    	public static void main(String[] args){
    		java.util.Scanner scan=new java.util.Scanner(System.in);
	    		int num=scan.nextInt();
	    		int counter=0;
				int[] All=new int[101];
				int[] Card=new int[num];
					for(int i=0;i < num;i++){
					   int ace=scan.nextInt();
						   if(All[ace]==0){
						   		Card[counter++]=ace;
						   }
						All[ace]++;
					}
					if( (counter == 2) && (Card[0] != Card[1]) && (All[Card[0]] == num/2) && (All[Card[1]]==num/2) ){
						System.out.println("YES");
						System.out.println(Card[0]+" "+Card[1]);
					}
					else System.out.println("NO");
		}
}
