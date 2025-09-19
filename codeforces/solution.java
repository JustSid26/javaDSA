import java.util.*;
public class solution{
	public static void main(String argsp[]){
		Scanner o = new Scanner(System.in);
		int t = o.nextInt();
		for(int i = 0; i < t; i++){
			int n = o.nextInt();
			int x = o.nextInt();
			if(x % 2 == 0)
				System.out.println(0);
			else
				System.out.println(n);
		}
	}
}