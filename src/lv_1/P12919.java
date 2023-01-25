package lv_1;

public class P12919 {
	
	public String solution(String[] seoul) {
        String answer = "";
        int idx = 0;
        
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		idx = i;
        		break;
        	}
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append("김서방은 ");
        sb.append(idx);
        sb.append("에 있다");
        
        answer = sb.toString();
        return answer;
    }

}
