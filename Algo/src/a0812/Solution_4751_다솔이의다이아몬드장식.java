package a0812;

import java.util.Scanner;
//단순하게 string에 .#.이런식으로 도배하는 노가다형 for문을 작성하고 싶지 않았다.
public class Solution_4751_다솔이의다이아몬드장식 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc > 0) {
			String str = sc.next();
			int m = str.length() * 4 + 1;
			char[][] map = new char[5][m];
			for(int i=0; i<5; i++) { 
				for(int j=0; j<m; j++) {
					if((i==0||i==4)&&j%4==2) map[i][j] = '#';
					else if((i==1||i==3)&&j%2==1) map[i][j] = '#';
					else if(i==2&&j%4==0) map[i][j] = '#';
					else if(i==2&&j%4==2) map[i][j] = str.charAt(j/4);
					else map[i][j] = '.';
				}
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<m; j++) {
					System.out.print(map[i][j]);
				}System.out.println();
			}
			tc--;
		}
	}

}
