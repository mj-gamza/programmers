package lv_0;

import java.util.ArrayList;

public class P120846 {
    public int solution(int n) {
        int answer = 0;
        
        int[] intArr = new int[n];
        
        for(int i=0;i<n;i++){
            intArr[i] = i+1;
        }
        
        for(int i=0;i<intArr.length;i++){
            
            ArrayList<Integer> intList = new ArrayList<>();
            
            for(int j=1;j<=intArr[i];j++){
                if(intArr[i]%j == 0){
                    intList.add(j);
                }
            }
            
            if(intList.size()>=3){
                answer++;
            }
        }
        
        return answer;
    }
    
    /*public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            
            int count = 0;
            
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            
            if(count>=3){
                answer++;
            }
            
        }
        
        return answer;
    }*/

}
