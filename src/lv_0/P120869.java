package lv_0;

public class P120869 {
	
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int speLen = spell.length;
        int dicLen = dic.length;
        int check = 0;
        
        for(int i=0;i<dicLen;i++){
            check = 0;
            for(int j=0;j<speLen;j++){
                
                if(dic[i].indexOf(spell[j]) == -1){ //단어에 알파벳이 없으면 다음 단어로
                    check++;
                    break;
                }
                
                if(dic[i].indexOf(spell[j]) != dic[i].lastIndexOf(spell[j])){ //단어에 알파벳이 두개 이상이면
                    check++;
                    break;
                }
            }
            
            if(check == 0){
                answer = 1;
            }
        }
        
        return answer;
    }

}
