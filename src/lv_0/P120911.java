package lv_0;

import java.util.Arrays;

public class P120911 {
    public String solution(String my_string) {
        String answer = "";

        StringBuffer sb = new StringBuffer();

        answer = my_string.toLowerCase();

        String[] arr = answer.split("");
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

        answer = sb.toString();

        return answer;
    }

/*    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] chArr = my_string.toCharArray();
        
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        
        return answer;
    }*/
    
}
