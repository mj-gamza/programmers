package lv_0;

public class P120904 {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = Integer.toString(num);
        String con = Integer.toString(k);
        
        if(str.contains(con)){
            answer = str.indexOf(con)+1;
        }else{
            answer = -1;
        }
        
        return answer;
    }
}
