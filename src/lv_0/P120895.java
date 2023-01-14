package lv_0;

public class P120895 {

	public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        String str1 = my_string.substring(0, num1);
        String str2 = my_string.substring(num1, num1+1);
        String str3 = my_string.substring(num1+1, num2);
        String str4 = my_string.substring(num2, num2+1);
        String str5 = my_string.substring(num2+1, my_string.length());
        
        sb.append(str1);
        sb.append(str4);
        sb.append(str3);
        sb.append(str2);
        sb.append(str5);
        
        answer = sb.toString();
        
        return answer;
    }
	
/*    public String solution(String my_string, int num1, int num2) {
        
        StringBuffer sb = new StringBuffer();
        
        String answer = "";
        
        String[] str = my_string.split("");
        
        String tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        
        answer = sb.toString();
       
        return answer;
    }*/
}
