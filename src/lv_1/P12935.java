package lv_1;

import java.util.Arrays;

public class P12935 {
	
	public static int[] solution(int[] arr) {
        
        if(arr.length==1) {
        	return new int[] {-1};
        }
        
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=copy[0]) {
        		answer[idx] = arr[i];
        		idx++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] n = {4,3,2,1};
		solution(n);
	}

}
