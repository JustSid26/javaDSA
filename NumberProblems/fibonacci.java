public class fibonacci{
	public static int fibRecur(int n){ //using recursion
		if(n<=1) return n;
		return fibRecur(n-1) + fibRecur(n-2);
	}
	public static void fibItera(int n){ //using loop
		if(n<=1) System.out.println(n);
		int a = 0; int b = 1;
		for(int i = 2; i <= n; i++){
			int sum = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}
	public static void fibSpace(int n){ //using array for O(1) space
		if(n<=1) System.out.println(n);
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i <= n; i++ ){
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[n]);
	}

	public static void main(String args[]){
		int num = 10;
		System.out.println(fibRecur(num)); // recursion
		fibItera(num); // iteration
		fibSpace(num); // dynamic programming
	}
}