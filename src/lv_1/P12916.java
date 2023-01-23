package lv_1;

public class P12916 {

	private static String p = "p";
	private static String y = "y"; 
	
	static boolean solution(String s) {
        boolean answer = false;
        int cntP = 0;
    	int cntY = 0;

        s = s.toLowerCase();
        
        String[] arr = s.split("");
        
        for(String str : arr) {
        	if(str.equals(p)) {
        		cntP++;
        	}else if(str.equals(y)) {
        		cntY++;
        	}
        }
        
        if((cntP==0&&cntY==0) || cntP==cntY) {
        	answer = true;
        }

//        System.out.println(answer);
        return answer;
    }
	
//	public static void main(String[] args) {
//		solution("Ppppyyyouk");
//	}
}
