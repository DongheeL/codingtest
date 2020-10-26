package printer;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
//		1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
//		2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
//		3. 그렇지 않으면 J를 인쇄합니다.
		
	}

}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
    	LinkedList<Integer> pIndex = new LinkedList<Integer>();
    	LinkedList<Integer> value = new LinkedList<Integer>();
    	for(int i=0;i<priorities.length;i++) {
    		pIndex.add(i);
    		value.add(priorities[i]);
    	}
    	for(int i=0;i<value.size();i++) {
    		for(int j=i+1;j<value.size();j++) {
    			if(value.get(i)<value.get(j)) {
    				value.offer(value.remove(i));
    				pIndex.offer(pIndex.remove(i));
    				i--;
    				break;
    			}
    		}
    	}
    	answer = pIndex.indexOf(location)+1;
        return answer;
    }
}