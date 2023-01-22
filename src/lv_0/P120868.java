package lv_0;

import java.util.Arrays;

public class P120868 {
	
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        //나머지 한 변이 가장 긴 변인 경우
        int n = sides[1] + 1;
        int sum = sides[0] + sides[1];
        
        for(int i=n;i<sum;i++){
            answer++;
        }
        
        //가장 긴 변이 sides[1]인 경우
        n = sides[1] - sides[0] + 1;
               
        for(int i=n;i<=sides[1];i++){
            answer++;
        }
        
        if(answer==0){
            answer=1;
        }
                
        return answer;
                
    }

}
