package lv_0;

public class P120902 {
    private String plus = "+";
    private String minus = "-";
    private int answer = 0;
    
    public int solution(String my_string) {
        
        String[] arr = my_string.split(" ");
        answer += Integer.parseInt(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                continue;
            }
            
            if(arr[i].equals(plus)){
                doPlus(arr, i);
            }else if(arr[i].equals(minus)){
                doMinus(arr, i);
            }
        }
        
        return answer;
    }
    
    private void doPlus(String[] arr, int i){
        answer += Integer.parseInt(arr[i+1]);
    }
    
    private void doMinus(String[] arr, int i){
        answer -= Integer.parseInt(arr[i+1]);
    }

}
