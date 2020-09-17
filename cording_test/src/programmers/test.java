package programmers;

public class test {
	
	public static void main(String[] args) {
		//팩토리얼 계산
		int n=5; //5*4*3*2*1 = 120
		
		int result = func(n);
		System.out.println(result);
	}
	public static int func(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return n*func(n-1);
	}
}
