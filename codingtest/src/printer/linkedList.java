package printer;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
//		1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
//		2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
//		3. �׷��� ������ J�� �μ��մϴ�.
		
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