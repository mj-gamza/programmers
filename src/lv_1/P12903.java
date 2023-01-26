package lv_1;

public class P12903 {
	
	public static String solution(String s) {
        String answer = "";
        int idx;
        
        if(s.length()%2==0) {
        	idx = s.length()/2;
        	answer = s.substring(idx-1, idx+1);
        }else {
        	idx = s.length()/2 + 1;
        	answer = s.substring(idx-1, idx);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		solution("asdb");
	}

}
