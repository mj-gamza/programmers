package lv_0;

public class P120860 {
    public int solution(int[][] dots) {
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = 0, y2 = 0;
        
        for(int i=0;i<4;i++){
            if(dots[i][0] != x1){
                x2 = dots[i][0];
            }
            
            if(dots[i][1] != y1){
                y2 = dots[i][1];
            }
        }
        
        int width = getWidth(x1, x2);
        int height = getHeight(y1, y2);
    
        return width*height;
    }
    
    private int getWidth(int x1, int x2){
        if(x1 > x2){
            return x1 - x2;    
        }else{
            return x2 - x1;
        }
    }
    
    private int getHeight(int y1, int y2){
        if(y1 > y2){
            return y1 - y2;
        }else{
            return y2 - y1;
        }
    }

}
