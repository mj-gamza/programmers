package lv_1;

import java.util.ArrayList;
import java.util.List;

public class P12928 {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        
        for(int num : list){
            answer += num;
        }
        
        return answer;
    }
}
