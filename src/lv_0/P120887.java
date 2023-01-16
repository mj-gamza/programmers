package lv_0;

public class P120887 {

    public int solution(int i, int j, int k) {
        int answer = 0;        
        
        while(i<=j){
            
            int n = i;
            
            while(n>0){
                
                if(n%10 == k){
                    answer++;
                }

                n /= 10;
            
            }
            
            i++;
            
        }
        
        return answer;
    }
}
