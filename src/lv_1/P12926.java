package lv_1;

public class P12926 {
	
	public static String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	
        	if(ch!=' ') {
        		if(Character.isLowerCase(ch)) {
        			sb.append(lower(ch,n));
        		}else if(Character.isUpperCase(ch)) {
        			sb.append(upper(ch, n));
        		}
        	}else {
        		sb.append(" ");
        	}
        }
        
        answer = sb.toString();
        
        return answer;
    }
	
	private static char lower(char ch, int n) {
		if(ch+n<='z') {
			return (char)(ch+n);
		}else {
			return (char)(ch+n-'z'+'a'-1);
		}
	}
	
	private static char upper(char ch, int n) {
		if(ch+n<='Z') {
			return (char)(ch+n);
		}else {
			return (char)(ch+n-'Z'+'A'-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("afa EzZ", 5));
	}

}
