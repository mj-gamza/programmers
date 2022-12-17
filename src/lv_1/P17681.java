package lv_1;

public class P17681 {

	public static void main(String[] args) throws Exception{
		
	}
}

/*
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	
    	//길이가 n인 배열 생성
    	String[] answer = new String[n];
    	
    	//배열값을 모두 비교해야 하기 때문에 n번 반복
    	for(int i=0;i<n;i++) {
    		
    		//비트연산자(|) 사용해서 값 비교
    		//[주의: 비트연산자는 10진수로 진행해야 한다.]
    		
    		//toBinaryString 사용해서 이진수로 변환한 후, answer 배열에 넣는다.
    		//toBinaryString는 반환타입이 String이기 때문에 따로 형변환이 필요하지 않다.
    		answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
    		
    		//이진수로 변환한 값의 길이가 n보다 작을 수 있다.
    		//이러한 경우에는 자릿수를 채우기 위해 앞에 0을 붙여준다.
    		while(answer[i].length()<n) {
    			answer[i] = 0 + answer[i];
    		}
    		
    		//replace를 사용해서 1은 #으로, 0은 공백으로 변환한다.
    		answer[i] = answer[i].replace('1', '#');
    		answer[i] = answer[i].replace('0', ' ');
    		
    	}
        return answer;
    }
}
*/

//이 방법이 속도가 더 빠르다.
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	
    	String[] answer = new String[n];
    	
    	for(int i=0;i<n;i++) {
    		
    		//n의 최대값이 16이기 때문에 이진수로 변환한 값의 길이를 16으로 고정한다.
    		answer[i] = String.format("%16s", Integer.toBinaryString(arr1[i]|arr2[i]));
    		
    		//substring을 사용해서 길이가 n인 문자가 되도록 자른다.
    		answer[i] = answer[i].substring(16-n);
    		
    		answer[i] = answer[i].replace('1', '#');
    		answer[i] = answer[i].replace('0', ' ');
    		answer[i] = answer[i].replace(' ', ' ');
    		
    	}
        return answer;
    }
}
