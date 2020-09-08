package kakao;

public class failure_rate_2018 { //풀긴풀었는데 정확성 70퍼;;
	
	static double[] mid;
	static int[] answer;
	static double m= 0;
	
	public static void main(String[] args) {
		int n =4;
		int[] stages = {4,4,4,4,4};
		
		int[] arr1=new int[n+1]; //해당 스테이지 '실패인원'
		int[] arr2=new int[n+1]; //해당 스테이지 '도전인원'
		
		mid=new double[n+1]; //'실패확율'담은 배열
		
		answer=new int[n]; //실패확율 내림차순으로 'mid 인덱스 번호'출력
		
		
		for(int i=1; i<=n; i++) { //스테이지갯수
			for(int j=0; j<stages.length; j++) { //스테이지인원
				
				if(stages[j]==i) {
					arr1[i]+=1;
				}
				if(stages[j]>=i) {
					arr2[i]+=1;
				}
			}
			mid[i]=((double)arr1[i]/arr2[i]); //mid배열 1~5인덱스까지
		}
		
		//확율비교  (0, 0.5, 0.123, 0.32 ...)
		
		for(int i=0; i<n; i++) {
			
			for(int j=1; j<=n; j++) { 
				if(m<mid[j]) {
					m = mid[j]; //가장 큰값 m에 담기
				}
			}
			for(int k=1; k<=n; k++) {
				//System.out.println(k+"m:"+m);
				if(m==mid[k]) {
					func(i,k);
					mid[k]=-1;
				}
			}
			m=0;
		}
		
		for(int i=0; i<answer.length; i++) {			
			System.out.println(answer[i]);
		}

	}
	
	public static void func(int i, int k) {

		if(answer[i]==0) { //비어있을때
			answer[i]=k; //m과 같은 mid배열의 인덱스번호 찾아서 answer배열에 넣기						
		}else {
			func(i+1,k);
		}

		return;
	}
	
	
}
