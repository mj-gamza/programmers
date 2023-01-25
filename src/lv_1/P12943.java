package lv_1;

public class P12943 {
	
	public static int solution(int num) {
        int answer = 0;
        
        long n = num;
        
        while(n!=1) {
        	if(n%2 == 0) {
        		n /= 2;
        	}else {
        		n = n*3 + 1;
        	}
        	answer++;
        	
        	if(answer==500) {
        		answer = -1;
        		break;
        	}
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(6);
	}

}
