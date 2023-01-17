package lv_0;

import java.util.Arrays;
import java.util.Collections;

public class P120835 {
	
    public int[] solution(int[] emergency) {
        
        int length = emergency.length;
        
        int[] answer = new int[length];
        
        for(int i=0;i<length;i++){
            
            int count = 1;
            
            for(int j=0;j<length;j++){
                if(emergency[i] < emergency[j]){
                    count++;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
    
    /*public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] emSort = Arrays.copyOfRange(emergency, 0, emergency.length);
        
        Integer[] em = Arrays.stream(emSort).boxed().toArray(Integer[]::new);
        Arrays.sort(em, Collections.reverseOrder());
        
        String[] strEm = new String[emergency.length];
        for(int i=0;i<strEm.length;i++){
            strEm[i] = Integer.toString(emergency[i]);
        }
        
        String[] strSort = new String[em.length];
        for(int i=0;i<strSort.length;i++){
            strSort[i] = Integer.toString(em[i]);
        }
        
        for(int i=0;i<strSort.length;i++){
            answer[i] = Arrays.asList(strSort).indexOf(strEm[i]) + 1;
        }
        
        return answer;
    }*/

}
