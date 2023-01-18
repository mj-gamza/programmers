package lv_0;

import java.util.ArrayList;

public class P120913 {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        int start = 0;
        int end = start + n;
        
        while(start != my_str.length()){
            list.add(my_str.substring(start,end));
            
            start = end;
            end = start + n;
            
            if(end>my_str.length()){
                end = my_str.length();
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

}
