package a0811;

import java.util.Scanner;

public class Solution_7728_다양성측정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int cnt = 0;
			boolean[] visit = new boolean[10];
			String str = sc.next();
			for(int i=0; i<str.length(); i++) {
				int num = str.charAt(i) - '0';
				if(!visit[num]) {
					visit[num] = true;
					cnt++;
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
	}

}
