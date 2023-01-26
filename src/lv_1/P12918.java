package lv_1;

import java.util.regex.Pattern;

public class P12918 {
	
	public static boolean solution(String s) {
        boolean answer = true;
        String str = "^[a-zA-Z]";
        
        if(s.length()!=4 && s.length()!=6) {
        	return false;
        }
        
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	
        	boolean result = Pattern.matches(str, String.valueOf(ch));
        	
        	if(result) {
        		answer = false;
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		solution("123");
	}

}
