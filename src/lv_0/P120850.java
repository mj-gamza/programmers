package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class P120850 {
	public int[] solution(String my_string) {

		ArrayList<Integer> list = new ArrayList<>();

		char[] chArr = my_string.toCharArray();

		for(int i=0;i<chArr.length;i++){
			if(Character.isDigit(chArr[i])){
				list.add(Character.getNumericValue(chArr[i]));
			}
		}

		int[] answer = new int[list.size()];

		for(int i=0;i<answer.length;i++){
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		return answer;
	}
	
//    public int[] solution(String my_string) {
//        
//        my_string = my_string.replaceAll("[a-z]","");
//        
//        int[] answer = new int[my_string.length()];
//        
//        for(int i=0;i<answer.length;i++){
//            answer[i] = my_string.charAt(i) - '0';
//        }
//        
//        Arrays.sort(answer);
//        
//        return answer;
//        
//	}
}
