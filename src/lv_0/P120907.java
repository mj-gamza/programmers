package lv_0;

public class P120907 {
	
    private String plus = "+";
    private String minus = "-";
    private String y = "O";
    private String n = "X";
    private int result, num1, num2;
    
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] arr = quiz[i].split(" ");
            
            result = Integer.parseInt(arr[4]);
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[2]);

            if(arr[1].equals(plus)){
                if(num1+num2==result){
                    answer[i] = y;
                }else{
                    answer[i] = n;
                }
            }else{
                if(num1-num2==result){
                    answer[i] = y;
                }else{
                    answer[i] = n;
                }
            }
            
        }       
        return answer;
    }

}
