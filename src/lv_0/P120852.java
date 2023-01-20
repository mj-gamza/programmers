package lv_0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P120852 {
	
    public int[] solution(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        int i = 2;
        
        while(n>1){
            
            if(n%i==0){
                set.add(i);
                n /= i;
                i = 2;
            }else{
                i++;
            }
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }

}
