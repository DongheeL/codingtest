package squares;

public class Math_floor {

	public static void main(String[] args) {
//		���ΰ� 8, ���ΰ� 12�� ���簢���� �밢�� �������� �ڸ��� �� 16�� ���簢���� ����� �� ���� �˴ϴ�.
//		���� ���簢�������� 96���� ���簢���� ���� �� �־����Ƿ�, 96 - 16 = 80 �� ��ȯ�մϴ�.
	}

}
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        
        double y= (double)w/h;
        for(int i=0;i<h;i++) {
        	answer += Math.floor(y*i);
        }
        answer = answer*2;
        return answer;
    }
}