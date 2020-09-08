package kakao;

public class secret_map_2018 {
	public static void main(String[] args) {
		int n=5;
		int[] arr1= {9,20,28,18,11};
		int[] arr2= {30,1,21,17,28};
		
		//2진수를 넣을 배열 생성
		String[] binary_arr1= new String[arr1.length];
		String[] binary_arr2= new String[arr2.length];
		
		//최종 출력배열
		String[] result=new String[arr1.length];

		
        for(int i=0; i<n; i++){
        	binary_arr1[i] = Integer.toBinaryString(arr1[i]);
        	binary_arr2[i] = Integer.toBinaryString(arr2[i]);
        	
        	//ex.arr[0]값의 길이가 3일 때, int p=3, n-p=5-3=2 
        	//j<2 --> j=0,1 arr[0]=0+101 arr[0]=0+0101=00101 5글자로 출력가능
        	if(binary_arr1[i].length()!=n) {
        		int p = binary_arr1[i].length();
        		for(int j=0; j<n-p; j++) {
        			binary_arr1[i]="0"+binary_arr1[i];  //****앞에 0추가
        		}
        	}
        	if(binary_arr1[i].length()!=n) {
        		int p = binary_arr1[i].length();
        		for(int j=0; j<n-p; j++) {
        			binary_arr1[i]="0"+binary_arr1[i];
        		}
        	}
        	
        	result[i]="";
        	
        	for(int j=0; j<n; j++) {
                int n1 = (int)(binary_arr1[i].charAt(j)-'0');//-'0'를 붙여주면 아스키코드값이아닌 바로 int형으로 출력가능
            	int n2 = (int)(binary_arr2[i].charAt(j)-'0');
            	
            	String e = (n1+n2==0? " ":"#"); //삼항 연산자
            	result[i]+=e; //****값을 계속 이어붙여주기
            }
        	
        }
	}
}
