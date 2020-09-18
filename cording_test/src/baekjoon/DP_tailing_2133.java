package baekjoon;

public class DP_tailing_2133 {
	static int[] arr = new int[100];
	public static void main(String[] args) {
		int n =4;
		int a = func(n);
		System.out.println(a);
	}
	public static int func(int n) {
		if(n==0) return 1; // 2*func(0)=2 //func(0)==1
		if(n==1) return 0;
		if(n==2) return 3;
		if(arr[n]!=0) return arr[n]; //n-1아래 수들을 배열에 저장시켜준다. //arr[n]>int형
		
		int result=func(n-2)*3;
		for(int i=3; i<=n; i++) {
			if(i%2==0) {
				result+=func(n-i)*2; //n이 4일 경우 4-4=0 > 2*func(0)=2 
			}
		}
		
		return arr[n]=result;
	}
}
