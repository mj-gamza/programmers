package lv_0;

import java.util.Arrays;

public class P120886 {

    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        int check = 0;
        
        for(int i=0;i<before.length();i++){
            if(beforeChar[i] == afterChar[i]){
                check++;
            }
        }
        
        if(check == before.length()){
            answer = 1;
        }
        
        return answer;
    }
    
    /*public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        String b = new String(beforeChar);
        String a = new String(afterChar);
        
        if(b.equals(a)){
            answer = 1;
        }
        
        return answer;
    }*/
}
