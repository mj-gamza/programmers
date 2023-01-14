package lv_0;

public class P120891 {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = String.valueOf(order);
        
        for(int i=0;i<orderStr.length();i++){
            char ch = orderStr.charAt(i);
            
            if(ch-'0' == 3 || ch-'0' == 6 || ch-'0' == 9){
                answer++;
            }
        }
        return answer;
    }
    
/*    public int solution(int order) {
        int answer = 0;
        
        while(order>0){
            
            if(order%10 == 3 || order%10 == 6 || order%10 == 9){
                answer++;
            }
            
            order /= 10;
            
        }
        return answer;
    }*/
}
