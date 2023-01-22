package lv_0;

public class P120812 {

    public int solution(int[] array) {
        
        int[] arr = new int[1001];
        
        for(int i=0;i<array.length;i++){
            arr[array[i]]++;
        }
        
        int max = 0;
        int maxNum = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                maxNum = i;
            }
        }
        
        int cnt = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                cnt++;
            }
        }
        
        if(cnt>1){
            return -1;
        }else{
            return maxNum;
        }        
    }
    
    /*public int solution(int[] array) {
        int max = 0;
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int number : array){
            
            int cnt = map.getOrDefault(number, 0) + 1;
            
            if(cnt>max){
                max = cnt;
                answer = number;
            }else if(cnt==max){
                answer = -1;
            }
            
            map.put(number, cnt);
            
        }
        
        return answer;
    }*/
	
    /* 에러 발생 > 왜? ..
     * 
     * public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer,Integer> map = new LinkedHashMap<>();
        
        for(int i : array){
            if(map.get(i)==null){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        
        List<Map.Entry<Integer,Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        
        int[] key = new int[map.size()];
        int[] value = new int[map.size()];
        int i = 0;
        int len = key.length;
        
        for(Map.Entry<Integer,Integer> entry : entryList){
            key[i] = entry.getKey();
            value[i] = entry.getValue();
            i++;
        }
        
        if(len>1 && (value[len-1]==value[len-2])){
            answer = -1;
        }else{
            answer = value[len-1];
        }
        
        return answer;
    }*/
	
}
