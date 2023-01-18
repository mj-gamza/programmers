package lv_0;

public class P120853 {
	
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        int i = 0;
        
        while(i<arr.length){
            if(!arr[i].equals("Z")){
                answer += Integer.parseInt(arr[i]);
            }else{
                answer -= Integer.parseInt(arr[i-1]);
            }
            i++;
        }
        
        return answer;
    }

}
