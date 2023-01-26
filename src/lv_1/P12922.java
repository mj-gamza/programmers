package lv_1;

public class P12922 {
	
	public static String solution(int n) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=1;i<=n;i++) {
        	if(i%2!=0) {
        		sb.append("수");
        	}else {
        		sb.append("박");
        	}
        }
        
        answer = sb.toString();

        return answer;
    }
	
	public static void main(String[] args) {
		solution(3);
	}

}
