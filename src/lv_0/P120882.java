package lv_0;

public class P120882 {
	
    public int[] solution(int[][] score) {
        
        int[] rank = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i=0;i<score.length;i++){
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i=0;i<avg.length;i++){
            int cnt = 1;
            
            for(int j=0;j<avg.length;j++){
                if(avg[i] < avg[j]){
                    cnt++;
                }
            }
            
            rank[i] = cnt;        
        }
        
        return rank;
    }
    
    /*public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] arr : score){
            list.add(arr[0] + arr[1]);
        }
        
        list.sort(Comparator.reverseOrder());
        
        for(int i=0;i<score.length;i++){
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }*/

}
