package lv_0;

public class P120864 {
	
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        
        for(int i=0;i<len;i++){
            char ch = my_string.charAt(i);
            
            if(!(ch-'0'>=0 && ch-'0'<10)){
                my_string = my_string.replace(String.valueOf(ch),"-");
            }
        }
        
        String[] str = my_string.split("-");
        
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                answer += Integer.parseInt(str[i]);
            }
        }
        
        return answer;
    }

}
