package lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P12910 {
	
	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        
        for(int num : arr) {
        	if(num%divisor == 0) {
        		list.add(num);
        		cnt++;
        	}
        }
        
        if(cnt==0) {
        	int[] answer = {-1};
        	return answer;
        }else {
        	int[] answer = new int[cnt];
        	
        	for(int i=0;i<cnt;i++) {
        		answer[i] = list.get(i);
        	}
        	Arrays.sort(answer);
            
            return answer;
        }
    }
	
	public static void main(String[] args) {
		
	}

}
