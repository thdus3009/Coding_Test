package kakao;

public class failure_rate_2018 { //Ǯ��Ǯ���µ� ��Ȯ�� 70��;;
	
	static double[] mid;
	static int[] answer;
	static double m= 0;
	
	public static void main(String[] args) {
		int n =4;
		int[] stages = {4,4,4,4,4};
		
		int[] arr1=new int[n+1]; //�ش� �������� '�����ο�'
		int[] arr2=new int[n+1]; //�ش� �������� '�����ο�'
		
		mid=new double[n+1]; //'����Ȯ��'���� �迭
		
		answer=new int[n]; //����Ȯ�� ������������ 'mid �ε��� ��ȣ'���
		
		
		for(int i=1; i<=n; i++) { //������������
			for(int j=0; j<stages.length; j++) { //���������ο�
				
				if(stages[j]==i) {
					arr1[i]+=1;
				}
				if(stages[j]>=i) {
					arr2[i]+=1;
				}
			}
			mid[i]=((double)arr1[i]/arr2[i]); //mid�迭 1~5�ε�������
		}
		
		//Ȯ����  (0, 0.5, 0.123, 0.32 ...)
		
		for(int i=0; i<n; i++) {
			
			for(int j=1; j<=n; j++) { 
				if(m<mid[j]) {
					m = mid[j]; //���� ū�� m�� ���
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

		if(answer[i]==0) { //���������
			answer[i]=k; //m�� ���� mid�迭�� �ε�����ȣ ã�Ƽ� answer�迭�� �ֱ�						
		}else {
			func(i+1,k);
		}

		return;
	}
	
	
}
