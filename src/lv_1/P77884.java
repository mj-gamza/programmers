package lv_1;

public class P77884 {
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++) {
        	
        	int cnt = 0;
        	
        	for(int j=1;j<=Math.sqrt(i);j++) {
        		if(i%j==0) {
        			if(j==Math.sqrt(i)) {
        				cnt++;
        			}else {
        				cnt += 2;
        			}
        		}
        	}
        	
        	if(cnt%2==0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }

        return answer;
    }

	public static void main(String[] args) {
		solution(24, 27);
	}
	
}
