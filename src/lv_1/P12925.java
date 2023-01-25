package lv_1;

public class P12925 {
	
	public static int solution(String s) {
        int answer = Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
	
	/*public static int solution(String s) {
        int answer = 0;
        
        if(s.contains("-")) {
        	answer = Integer.parseInt(s.substring(1))*(-1);
        }else if(s.contains("+")) {
        	answer = Integer.parseInt(s.substring(1));
        }else {
        	answer = Integer.parseInt(s);
        }
        System.out.println(answer);
        return answer;
    }*/
	
	public static void main(String[] args) {
		solution("-4515623");
	}

}
