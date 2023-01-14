package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class P120897 {
	public int[] solution(int n) {

		ArrayList<Integer> list = new ArrayList<>();

		int mid = (int)Math.sqrt(n);

		for(int i=1;i<=mid;i++){
			if((n%i == 0) && (i != n/i)){
				list.add(i);
				list.add(n/i);
			}else if((n%i == 0) && (i == n/i)){
				list.add(i);
			}
		}

		int[] answer = new int[list.size()];

		for(int i=0;i<answer.length;i++){
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		return answer;
	}

}
