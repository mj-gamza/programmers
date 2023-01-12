package lv_0;

import java.util.Arrays;

public class P120862 {

    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int n1 = numbers[0] * numbers[1];
        int n2 = numbers[numbers.length-1] * numbers[numbers.length-2];

        if(n1>n2){
            answer = n1;
        }else{
            answer = n2;
        }

        return answer;
    }
	
}
