package lv_0;

public class P120843 {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        
        int num = 2*k - 1;
        
        if(num > len){
            num %= len;
        }
        
        return num;
    }

}
