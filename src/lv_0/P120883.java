package lv_0;

import java.util.HashMap;
import java.util.Map;

public class P120883 {
	
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        int len = db.length;
        
        for(int i=0;i<len;i++){
            if(!db[i][0].equals(id)){
                answer = "fail";
                continue;
            }
            
            if(!db[i][1].equals(pw)){
                answer = "wrong pw";
                break;
            }else{
                answer = "login";
                break;
            }
            
        }
        
        return answer;
    }

}

/*class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        if(getDB(db).get(id) == null){
            return answer = "fail";
        }
        
        if(!getDB(db).get(id).equals(pw)){
            return answer = "wrong pw";
        }else{
            return answer = "login";
        }
                
    }
    
    
    private Map<String, String> getDB(String[][] db){
        
        Map<String, String> map = new HashMap<>();
        
        for(String[] arr : db){
            map.put(arr[0], arr[1]);
        }
        
        return map;
        
    }
    
}*/
