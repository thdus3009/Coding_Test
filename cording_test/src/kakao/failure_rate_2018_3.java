package kakao;

import java.util.*;

public class failure_rate_2018_3 { //��øŬ���� , �켱���� ť Ȱ��
	
    private static class Stage {
        int idx;
        double percent;

        public Stage(int idx, double percent) {
            this.idx		= idx;
            this.percent	= percent;
        }
    }
    
	public static void main(String[] args) {
		int N =5;
		int[] stages = {2,1,2,6,2,4,3,3};
		
		int[] fail = new int[N];//���������� ���� ���� Ƚ���� ������ �迭
        int[] answer = new int[N];//�������� ������������ ������ ��� �迭
        int total = stages.length;//�������� ���ϱ� ���� �ʱⰪ

        for (int stage : stages) {

            if (stage > N) continue;//��� ���������� �����ߴٸ� ���� �б⹮����
            fail[stage-1]++;//���� Ƚ���� ����
        }

        //�켱����ť�� ������-�ε����� ������������ �����Ѵ�.
        PriorityQueue<Stage> pq = new PriorityQueue<Stage>(new Comparator<Stage>() {

            @Override
            public int compare(Stage o1, Stage o2) {

                if (o1.percent - o2.percent < 0) return 1;
                else if (o1.percent - o2.percent == 0) {

                    if (o1.idx < o2.idx) return -1;
                    else return 1;
                }
                else return -1;
            }
        });

        for (int i = 0,loop = fail.length; i < loop; i++) {

            Stage s = new Stage(i,(double)fail[i]/total);//�������� ���õ� ������ ������ ���� �������� �����ش�.

            pq.add(s);//�������� �������� �켱����ť�� �ش� ��ü�� ����
            total = (total - fail[i] == 0) ? 1 : total - fail[i];//���� ������������ ���� ���������� ����Ƚ���� ���ش�.

        }

        for (int i = 0,loop = answer.length; i < loop; i++) {

            answer[i] = pq.poll().idx+1;//��� �迭�� ������������ ���ĵ� �������� �������ش�.

        }

        //����
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
	}
}

