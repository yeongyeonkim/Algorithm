package a0820;

import java.util.Scanner;

public class Solution_3456_직사각형길이찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int d = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(b==c) d = a;
			else if(a==b) d = c;
			else if(a==c) d = b;
			else d = a;
			System.out.println("#"+t+" "+d);
		}
	}

}
