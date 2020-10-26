package stock;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
//		초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
//		가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
//		prices			return
//		[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
//		1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
//		2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
//		3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
//		4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
//		5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
		
	}

}
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        ArrayList<Integer> nums = new ArrayList<Integer>(prices.length);
        for(int i=0;i<prices.length;i++) {
        	int count=0;
        	for(int j=i+1;j<prices.length;j++) {
        		count++;
        		if(prices[j]>=prices[i]) {
        			continue;
        		}else {
        			break;
        		}
        	}
        	nums.add(count);
        }
        for(int i=0;i<answer.length;i++) {
        	answer[i]=nums.get(i);
        }
        return answer;

    }
    }