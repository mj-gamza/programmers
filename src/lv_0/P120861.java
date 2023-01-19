package lv_0;

public class P120861 {
	
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        //x축 이동가능거리
        int x = board[0]/2;
        
        //y축 이동가능거리
        int y = board[1]/2;
        
        //key 이동좌표
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("up")){
                answer[1]++;
                
                if(answer[1] > y){
                    answer[1] = y;
                }
            }else if(keyinput[i].equals("down")){
                answer[1]--;
                
                if(answer[1] < -y){
                    answer[1] = -y;
                }
            }else if(keyinput[i].equals("left")){
                answer[0]--;
                
                if(answer[0] < -x){
                    answer[0] = -x;
                }
            }else if(keyinput[i].equals("right")){
                answer[0]++;
                
                if(answer[0] > x){
                    answer[0] = x;
                }
            }
        }
                
        return answer;
    }

}
