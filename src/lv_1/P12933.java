package lv_1;

import java.util.Arrays;
import java.util.Collections;

public class P12933 {
	
	public static long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuffer sb = new StringBuffer();
        for(String s : arr) {
        	sb.append(s);
        }
        
        answer = Long.parseLong(sb.toString());
//        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		solution(13245681);
	}
	
}
