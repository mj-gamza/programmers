package lv_0;

public class P120815 {
    public int solution(int n) {

        int answer = 0;

        int piece;

        int min = n;
        if(n>6) min = 6;

        //6과 n의 최대공약수 구하기
        while(min>=1){
            if(n%min==0 && 6%min==0){
                piece = min * (n/min) * (6/min);
                answer = piece/6;

                min = 0;
            }
            min--;
        }
        return answer;
    }
    
/*    public int solution(int n) {
        
        int answer = 1;
        
        while(true){
            if(6*answer%n == 0) break;
            answer ++;
        }
        
        return answer;
    }*/

}
