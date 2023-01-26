package lv_1;

import java.util.Arrays;
import java.util.Collections;

public class P12917 {
	
	public static String solution(String s) {
        String[] arr = s.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<arr.length;i++) {
        	sb.append(arr[i]);
        }

        return sb.toString();
    }
	
	public static void main(String[] args) {
		solution("Zbcdefg");
	}

}
