package lv_1;

public class P86051 {
	
	public int solution(int[] numbers) {
        int answer = 45;
        
        for(int n : numbers){
            answer -= n;
        }
        
        return answer;
    }

}
