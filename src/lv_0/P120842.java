package lv_0;

public class P120842 {
    public int[][] solution(int[] num_list, int n) {
        
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        
        for(int i=0;i<num_list.length/n;i++){
            for(int j=0;j<n;j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        
        return answer;
    }

}