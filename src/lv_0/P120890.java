package lv_0;

import java.util.Arrays;

public class P120890 {
	
    public int solution(int[] array, int n) {
        
        Arrays.sort(array);
        
        int answer = array[0];
        int defaultSub = Math.abs(array[0] - n);
        
        for(int i=1;i<array.length;i++){
            
            int sub = Math.abs(array[i] - n);
            
            if(defaultSub > sub){
                defaultSub = sub;
                answer = array[i];
            }
            
        }
        
        return answer;
    }

}
