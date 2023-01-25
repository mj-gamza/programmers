package lv_1;

public class P12934 {
	
	public static long solution(long n) {
        long answer = 0;
        
        if(Math.sqrt((long)n)%1 == 0) {
        	answer = (long)Math.pow(Math.sqrt((long)n)+1, 2);
        }else {
        	answer = -1;
        }
//        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution(144);
	}

}
