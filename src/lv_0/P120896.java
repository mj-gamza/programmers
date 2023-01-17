package lv_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P120896 {
	
    public String solution(String s) {

        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            String str = s.replace(String.valueOf(s.charAt(i)),"");
            
            if(str.length()+1 == s.length()){
                set.add(String.valueOf(s.charAt(i)));
            }
        
        }
        
        ArrayList<String> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        String answer = String.join("",list);
        
        return answer;
    }
	
    /*public String solution(String s) {
        ArrayList<String> list = new ArrayList<>();
        
        String[] strArray = s.split("");
        
        for(int i=0;i<strArray.length;i++){
            if(s.indexOf(strArray[i]) == s.lastIndexOf(strArray[i])){
                list.add(strArray[i]);
            }
        }
        
        String[] array = new String[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        
        Arrays.sort(array);
        
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
        
        String answer = new String(sb);
        
        return answer;
    }*/
    
}
