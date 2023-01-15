package lv_0;

public class P120838 {
    public String solution(String letter) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String[] str = letter.split(" ");
        
        for(int i=0;i<str.length;i++){
            for(int j=0;j<morse.length;j++){
                if(str[i].equals(morse[j])){
                    sb.append(alpha[j]);
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }

}
