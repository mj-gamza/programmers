package lv_1;

public class P12948 {
	
	public static String solution(String phone_number) {
		int end = phone_number.length()-4;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<phone_number.length();i++) {
			char ch = phone_number.charAt(i);
			
			if(i<end) {
				sb.append("*");
			}else {
				sb.append(ch);
			}
		}
        
		String answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
	
	/*public static String solution(String phone_number) {
		String toStar = phone_number.substring(0, phone_number.length()-4);
        String answer = phone_number.replace(toStar, "*".repeat(toStar.length()));
        
        System.out.println(answer);
        return answer;
    }*/
	
	public static void main(String[] args) {
		solution("027778888");
	}

}
