package lv_1;

public class P87389 {
	
    public int solution(int n) {
        int i=2;
        int answer = 0;
        
        if(n%2==0){
            i = 3;
        }
        
        while(true){
            if(n%i==1){
                answer = i;
                break;
            }else{
                i += 2;
            }
        }
        
        return answer;
    }

}
