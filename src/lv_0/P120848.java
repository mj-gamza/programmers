package lv_0;

public class P120848 {
    public int solution(int n) {
        
        int i = 1;
        
        while(n/i>1){
            
            n = n/i;
            
            i++;
            
        }
        
        if(n/i == 0){
            i--;
        }
        
        return i;
    }
    
/*    public int solution(int n) {
        
        int fac = 1;
        int i = 1;
        
        while(fac<=n){
            
            i++;
            fac = fac * i;
         
        }
        
        return i-1;
    }*/


}
