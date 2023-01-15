package lv_0;

public class P120888 {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<my_string.length();i++){
            
            char ch = my_string.charAt(i);
            
            if(my_string.indexOf(ch) == i){
                sb.append(ch);
            }
        }
        
        String answer = new String(sb);
        
        return answer;
    }
    
/*    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        
        answer = String.join("",set);
        
        return answer;
    }*/
}
