package lv_1;

public class Test1{
	
	public static void main(String[] args) {
		
		int n = 0;
		
		for(int i=1;i<=110;i++) {
//			if(i%4==0) {
//				n++;
//			}else 
//			if(i%5==0) {
//				n++;
//			}else 
				if(i%6==0) {
				System.out.println(i);
				n++;
			}
		}
		
//		System.out.println(n);
		
		
		int a = 110/4;
		int b = 110/5;
		int c = 110/6;
		
		int d = 110/20;
		int e = 110/12;
		int f = 110/30;
		
		System.out.println("총개수: " + (c-e));
//		System.out.println(a+b+c-d-e-f);
	}
	
}

/*
public class Test1 {

	public void draw() {
		System.out.println("1");
		paint();
	}
	
	public void paint() {
		System.out.println("4");
		System.out.println("super");
	}
	
}

class Test2 extends Test1{
	
	public void draw() {
		System.out.println("0");
		super.draw();
		System.out.println("3");
		super.paint();
	}
	
	public void paint() {
		System.out.println("2");
		System.out.println("extends");
	}
	
	public static void main(String[] args) {
		Test1 test = new Test2();
		
		test.draw();
	}
}
*/

/*
class Solution {
    public String solution(String vote) {
    	
    	String answer = "";
    	
    	int voteCount = vote.length();
    	int countA = 0;
    	int countB = 0;
    	int countC = 0;
    	
    	for(int i=0;i<voteCount;i++) {
    		char voteResult = vote.charAt(i);
    		
    		if(voteResult==65) {
    			countA++;
    		}else if(voteResult==66) {
    			countB++;
    		}else {
    			countC++;
    		}
    	}
    	
    	if(countC>=(voteCount/2)) {
    		answer = "C";
    	}else if(countA>countB) {
    		answer = "A";
    	}else if(countA<countB) {
    		answer = "B";
    	}else {
    		answer = "AB";
    	}
    	
        return answer;
    }
}
*/
/*
class Solution {
    public int solution(int n, int[] v) {

        int max = v[0]-v[1];

        for(int i=0;i<n-1;i++) {

            for(int j=i+1;j<n;j++) {
            	if(v[i]<=max) break;

                if(max>0 && v[i]<v[j]) {
                    j++;
                }else if(v[i]-v[j]>max) {
                    max = v[i]-v[j];
                }
            }
        }
        return max;
    }
}
*/
/*
import java.util.*;

class Solution {
    public int solution(String[] bishops) {
    	
    	//비숍이 이동할 수 있는 위치를 A1 형식의 데이터로 set 타입에 넣으면 중복값 제거가 될 듯
    	
    	HashSet<String> hashSet = new HashSet<>();
    	
    	int[][] bishopsArr = new int[bishops.length][2];
    	
    	String[] strArr = {"A","B","C","D","E","F","G","H"};
    	String[] numArr = {"1","2","3","4","5","6","7","8"};
    	
    	for(int i=0;i<bishops.length;i++) {
    		int str = Arrays.asList(strArr).indexOf(bishops[i].substring(0, 0)); //y축
    		int num = Arrays.asList(strArr).indexOf(bishops[i].substring(1, 1)); //x축
    		
    		bishopsArr[i][0] = num; //x축
    		bishopsArr[i][1] = str; //y축
    	}
    	
    	
    	
        int answer = -1;
        return answer;
    }
}
*/

/*
class Solution1 {
    public int solution(String[] bishops) {
    	
    	int[][] bishopsArr = new int[bishops.length][2];
    	
    	int[][] chessboard = new int[8][8];
    	
    	for(int i=0;i<bishops.length;i++) {
    		bishopsArr[i][0] = bishops[i].charAt(0) - 'A';
    		bishopsArr[i][1] = bishops[i].charAt(1) - 1;
    		chessboard[bishopsArr[i][0]][bishopsArr[i][1]] = 1;
    	}
    	
    	for(int i=0;i<bishops.length;i++) {
    		
    		int x = bishopsArr[i][0];
    		int y = bishopsArr[i][1];
    		
    		int j = 0;
    		
    		while(j < 8) {
    			// 오른쪽 상단
    			int ax = j + bishopsArr[i][0];
    			int ay = j + bishopsArr[i][1];
    			
    			// 오른쪽 하단
    			int bx = ax;
    			int by = ay - (j*2);
    			
    			// 왼쪽 상단
    			int cx = ax - (j*2);
    			int cy = ay;
    			
    			// 왼쪽 하단
    			int dx = x - 1;
    			int dy = y - 1;
    			
    			if(ax<8 && ay<8 && ax>-1 && ay>-1) {
    				chessboard[ax][ay] = 1;
    			}
    			
    			if(bx<8 && by<8 && bx>-1 && by>-1) {
    				chessboard[bx][by] = 1;
    			}
    			
    			if(cx<8 && cy<8 && cx>-1 && cy>-1) {
    				chessboard[cx][cy] = 1;
    			}
    			
    			if(dx<8 && dy<8 && dx>-1 && dy>-1) {
    				chessboard[dx][dy] = 1;
    			}
    			
    			x = dx;
    			y = dy;
    			
    			j++;
    		}
    		
    	}
    	
    	int result = 0;
    	
    	for(int i=0;i<8;i++) {
    		for(int j=0;j<8;j++) {
    			if(chessboard[i][j] == 0) {
    				result++;
    			}
    		}
    	}
    	
    	return result;
    	
    	
    	
    	

    	// 체스판에 올라온 비숍의 좌표를 담은 이차원 배열
    	// x, y축 값을 한 세트로 하기 때문에 [2]
    	// 체스판 위에 올라온 비숍의 개수만큼 위 배열이 여러개 생기기 때문에
		int[][] bishopsArr = new int[bishops.length][2];
    	
    	// 좌표를 위한 xy
    	// 전체 체스판의 크기는 8*8이기 때문에 배열의 길이가 8*8
		// 0으로만 채워진 8*8 크기의 이차원 배열 생성
		int[][] xy = new int[8][8];

		// 각 비숍의 xy 좌표를 구한다.
		// bishops[i]를 구하면 D1 과 같은 형태로 나온다.
		// charAt()을 사용해서 x축(알파벳)을 꺼낸다. 이때 A를 빼는 이유는 알파벳을 숫자로 바꾸기 위함이다.
		// char 타입은 아스키코드값으로 숫자 연산이 가능하다. A=65이기 때문에 A를 0으로 놓고, B는 1, C는 2... 식으로 알파벳 별 x좌표를 숫자화한다.
		// 같은 방식으로 y축(숫자)도 꺼낸다. 1을 빼는 이유는 x축과 같이 0부터 시작하기 위함이다.
		// 0으로만 채워진 8*8크기의 체스판(xy[][])에 구한 x축과 y축 값을 넣고, 해당 위치에 +1을 해준다.
		// 비숍의 현재 위치를 표시한 것이다.
		for (int i = 0; i < bishopsArr.length; i++) {
			bishopsArr[i][0] = bishops[i].charAt(0) - 'A';
			bishopsArr[i][1] = bishops[i].charAt(1) - '1';
			xy[bishopsArr[i][0]][bishopsArr[i][1]] += 1;
		}
		
		
		for (int go = 0; go < bishops.length; go++) {
			// go번째 행의 x축, y축 값
			int x = bishopsArr[go][0];
			int y = bishopsArr[go][1];
			
			int i = 0;
			
			while (i < 8) {
				// x축 증가, y축 증가 -> 오른쪽 상단
				int nx = i + bishopsArr[go][0]; // x축 위치 + i
				int ny = i + bishopsArr[go][1]; // y축 위치 + i
				
				// x축 감소, y축 감소 -> 왼쪽 하단
				int mx = x - 1; // x축 위치 - 1
				int my = y - 1; // y축 위치 - 1
				
				// x축 상승, y축 감소 -> 오른쪽 하단
				// 오른쪽 상단과 x축은 같고, y축은 대칭을 이루며 감소한다.
				// 대칭인 점을 살려서 *2를 하고 뺀다.
				int ix = nx;
				int iy = ny - (i * 2);
				
				// x축 감소, y축 상승 -> 왼쪽 상단
				// 오른쪽 상단과 y축은 같고, x축은 대칭을 이루며 감소한다.
				// 대칭인 점을 살려서 *2를 하고 뺀다.
				int jx = nx - (i * 2);
				int jy = ny;

				
				// nx, ny가 0~7 범위에 속하면 체스판 안에 위치한다는 의미
				// 비숍이 이동할 수 있다는 의미로 0으로만 채워진 체스판(xy[][])에 1을 대입한다.
				if (nx < 8 && ny < 8 && nx > -1 && ny > -1) {
					xy[nx][ny] = 1;
				}
				
				// 위와 같은 논리로 체스판의 범위 내에 해당 변수값이 존재한다면 1을 대입한다.
				if (mx < 8 && my < 8 && mx > -1 && my > -1) {
					xy[mx][my] = 1;
				}

				if (ix < 8 && iy < 8 && ix > -1 && iy > -1) {
					xy[ix][iy] = 1;
				}
				if (jx < 8 && jy < 8 && jx > -1 && jy > -1) {
					xy[jx][jy] = 1;
				}

				// mx, my 부분(왼쪽 하단) 코드에서는 -1을 해주기 때문에 해당 변수를 구하기 위한 x,y 변수값이 바뀌어야 한다.
				// 때문에 x,y에 mx,my를 대입한다.
				x = mx;
				y = my;
				
				// 비숍이 갈 수 있는 위치 범위를 확장하기 위해 i값을 증가한다.
				i++;
			}
		}

		// answer는 비숍이 이동할 수 없는 좌표의 개수
		int answer = 0;
		
		// xy는 비숍이 이동할 수 있는 위치 좌표가 찍힌 이차원 배열(체스판)
		// 이차원 배열 길이만큼 반복 -> 8번 반복
		
		// k는 7부터 0까지 8번 반복
		// [0,7] 좌표부터 시작한다. -> 체스판의 왼쪽 상단부터 검사 시작
		// 해당 좌표값이 0이면 비숍이 이동할 수 없다는 의미 -> answer값 1 증가
		for (int i = 0; i < xy.length; i++) {
			for (int k = xy.length - 1; k > -1; k--) {
				System.out.print(xy[i][k] + " ");
				if (xy[i][k] == 0) {
					answer++;
				}
			}
		}
		
		// 비숍이 이동할 수 없는 좌표의 개수 반환
		// 좌표값의 데이터가 0인 개수 반환 
		return answer;
	}

}
 */











