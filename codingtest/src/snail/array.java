package snail;

public class array {

	public static void main(String[] args) {
		//������ �迭
//		���� n�� �Ű������� �־����ϴ�. 
//		���� �׸��� ���� �غ��� ���̿� ���̰� n�� �ﰢ������ �� �� ���������� �ݽð� �������� 
//		������ ä��⸦ ������ ��, ù ����� ������ ����� ��� ������� ��ģ ���ο� �迭��
//		return �ϵ��� solution �Լ��� �ϼ����ּ���.
	}

}
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] nums = new int[n][];
		for(int i=0;i<n;i++) {
			nums[i]= new int[i+1];
		}
		int turn =1;
		int row = -1, col=0;
		int num = 1;
		while(n>0) {
			int a = turn%3;
			for(int i=0;i<n;i++) {
				switch(a) {
				case 1:
						row++;
					break;
				case 2:
						col++;
					break;
				case 0:
					row--; col--;
					break;
				}
				nums[row][col]= num++;
			}
			turn++;
			n--;
		}
		answer = new int[num-1];
		int index = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				answer[index++] = nums[i][j]; 
			}
		}
        return answer;
    }
}