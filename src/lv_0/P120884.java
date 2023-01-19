package lv_0;

public class P120884 {
	
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken>=10){
            int service = chicken/10;
            int n = chicken%10;
            
            chicken = service + n;
            
            answer += service;
        }
        
        return answer;
    }
	
    /*public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while(chicken>0){
            answer += chicken/10;
            coupon += chicken%10;
            
            if(coupon/10 != 0){
                answer += coupon/10;
                chicken += coupon/10;
                coupon %= 10;
            }
            
            chicken /= 10;
        }
        
        return answer;
    }*/

}
