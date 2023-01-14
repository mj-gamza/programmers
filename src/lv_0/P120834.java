package lv_0;

public class P120834 {

	public String solution(int age) {
		String answer = "";

		StringBuffer sb = new StringBuffer();

		String[] str = {"a","b","c","d","e","f","g","h","i","j"};

		String[] ageArr = String.valueOf(age).split("");

		int idx;

		for(int i=0;i<ageArr.length;i++){
			idx = Integer.parseInt(ageArr[i]);

			sb.append(str[idx]);
		}

		answer = sb.toString();

		return answer;
	}

//	public String solution(int age) {
//		String answer = "";
//
//		String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
//
//		while(age>0){
//			answer = alpha[age%10] + answer;
//
//			age /= 10;
//		}
//
//		return answer;
//	}
	
//	public String solution(int age) {
//        StringBuffer sb = new StringBuffer();
//        
//		String answer = "";
//
//		String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
//
//		while(age>0){
//			sb = sb.append(alpha[age%10]);
//
//			age /= 10;
//		}
//        
//        answer = (sb.reverse()).toString();
//
//		return answer;
//	}

}
