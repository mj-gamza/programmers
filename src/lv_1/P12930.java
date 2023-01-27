package lv_1;

public class P12930 {
	
	public static String solution(String s) {
		
		String[] arr = s.split("");
		
		int idx = 0;
		for(int i=0;i<arr.length;i++) {
			if(!arr[i].equals(" ")) {
				if(idx%2==0) {
					arr[i] = arr[i].toUpperCase();
				}else {
					arr[i] = arr[i].toLowerCase();
				}
				idx++;
			}else {
				idx = 0;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
        
    }

	public static void main(String[] args) {
		System.out.println(solution("asdf asdf asdf"));
	}
}
