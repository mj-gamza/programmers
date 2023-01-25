package lv_1;

public class P12947 {
	
	public static boolean solution(int x) {
		
		int copy = x;
		int n = 0;
		
		while(copy>0) {
			n += copy%10;
			copy /= 10;
		}
		
        if(x%n == 0) {
        	return true;
        }else {
        	return false;
        }
    }

	public static void main(String[] args) {
		solution(123451);
	}
}
