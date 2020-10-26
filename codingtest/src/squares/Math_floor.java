package squares;

public class Math_floor {

	public static void main(String[] args) {
//		가로가 8, 세로가 12인 직사각형을 대각선 방향으로 자르면 총 16개 정사각형을 사용할 수 없게 됩니다.
//		원래 직사각형에서는 96개의 정사각형을 만들 수 있었으므로, 96 - 16 = 80 을 반환합니다.
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