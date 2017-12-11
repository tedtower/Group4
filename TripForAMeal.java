import java.util.Scanner;

public class TripForAMeal{
	public static void main(String[] args) {
            Scanner r=new Scanner (System.in);
		
                int n=(r.nextInt())-1;
		int a=r.nextInt();
		int b=r.nextInt();
		int c=r.nextInt();
		int min=Math.min(a, b);
		int t=0;
                    if(n==0){
			t=0;
                       }else if(min<=c){
			t=n*min;
                       }else{
			t=min+ c*(n-1);
                    }
                    System.out.println(r);
                }
}