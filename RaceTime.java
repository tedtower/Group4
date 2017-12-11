import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner r = new Scanner(System.in);
		while(r.hasNext()){
			double h = r.nextDouble();
			double m = r.nextDouble();
			double s = r.nextDouble();
			double t1 = r.nextDouble();
			double t2 = r.nextDouble();
			if(h == 12){h = 0;}
			if(t1 == 12){t1 = 0;}
			if(t2 == 12){t2 = 0;}
			t1 = t1 * 30;
			t2 = t2 * 30;
			h = h * 30 + m / 60 + s / 3600;
			m = m * 6 + s / 10;
			s = s * 6;
			//System.out.println(h + " " + m + " " + s + " " + t1 + " " + t2);
			if(t1 > t2){double tt = t1;t1 = t2;t2 = tt;}
                            int flag = 0;
                            
                            if(t1 < h && h < t2){flag ++;}
                            if(t1 < m && m < t2){flag ++;}
                            if(t1 < s && s < t2){flag ++;}
                            if(flag == 0 || flag == 3){System.out.println("YES");}
			else{
                                System.out.println("NO");
                            }
		}
	}
}