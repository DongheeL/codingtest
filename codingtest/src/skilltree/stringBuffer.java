package skilltree;

public class stringBuffer {

	public static void main(String[] args) {
//		예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 
//		먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
//		위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 
//		따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 
//		썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
		
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