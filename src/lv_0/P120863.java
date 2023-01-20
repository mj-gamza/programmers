package lv_0;

public class P120863 {

    private int num = 0;
    private int xNum = 0;
    private String strNum = "";
    private String answer = "";
    
    public String solution(String polynomial) {
        polynomial = polynomial.replace(" ","");
        String[] arr = polynomial.split("\\+");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("x")){
                getXnum(arr[i]);
            }else{
                num += Integer.parseInt(arr[i]);
            }
        }
        
        if(xNum==0){
            answer = Integer.toString(num);
        }else{
            strNum = returnStr(xNum);
            
            if(num==0){
                answer = strNum;
            }else{
                answer = strNum + " + " + num;
            }
        }
        
        return answer;
    }
    
    private String returnStr(int xNum){
        if(xNum==1){
            return "x";
        }else{
            return xNum + "x";
        }
    }
    
    private void getXnum(String str){
        if(str.length()==1){
            xNum++;
        }else{
            xNum += Integer.parseInt(str.substring(0,str.indexOf("x")));
        }
    }
}
