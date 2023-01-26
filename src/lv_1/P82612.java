package lv_1;

public class P82612 {
	
	public static long solution(int price, int money, int count) {
        long sum = price;
        
        for(int i=2;i<=count;i++) {
        	sum += price*i;
        }

        if(money-sum<0) {
        	return Math.abs(money-sum);
        }else {
        	return 0;
        }
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}

}
