package snail;

public class array {

	public static void main(String[] args) {
		//달팽이 배열
//		정수 n이 매개변수로 주어집니다. 
//		다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 
//		달팽이 채우기를 진행한 후, 첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을
//		return 하도록 solution 함수를 완성해주세요.
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