package skilltree;

public class stringBuffer {

	public static void main(String[] args) {
//		���� ��� ���� ��ų ������ ����ũ �� ����Ʈ�� ��Ʈ �� ����϶�, ����� ������ 
//		���� ����Ʈ�� ��Ʈ�� ����� �ϰ�, ����Ʈ�� ��Ʈ�� ������ ���� ����ũ�� ����� �մϴ�.
//		�� ������ ���� �ٸ� ��ų(���� ��)�� ������ ������� ��� �� �ֽ��ϴ�. 
//		���� ����ũ �� ���� �� ����Ʈ�� ��Ʈ �� ����� ���� ��ųƮ���� ����������, 
//		��� �� ����ũ�� ����Ʈ�� ��Ʈ �� ����ũ �� ���� �� ����� ���� ��ųƮ���� �Ұ����մϴ�.
		
	}

}
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skills = new char[skill.length()];
        for(int i=0;i<skill.length();i++) {
        	skills[i]=skill.charAt(i);
        }
        for(int i=0;i<skill_trees.length;i++) {
        	StringBuffer tree = new StringBuffer(skill_trees[i]);
    		for(int j=0;j<tree.length();j++) {
    			boolean ex = false;
    			for(int x=0;x<skills.length;x++) {
    				if(tree.charAt(j)==skills[x]) {
    					ex = true;
    					break;
    				}
    			}
    			if(!ex) {
    				tree.deleteCharAt(j);
    				j--;
    			}
    		}
    		if(tree.length()==0) {
    			answer++;
    		}else {
    			if(skill.indexOf(tree.toString())==0) {
    				answer++;
    			}
    		}
        }
        return answer;
    }
}