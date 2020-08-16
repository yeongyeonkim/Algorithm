package a0816;

import java.util.Scanner;

public class Solution_9317_석찬이의받아쓰기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int cnt = 0;
			sc.next();
			String str1 = sc.next();
			String str2 = sc.next();
			for(int i = 0; i<str1.length(); i++)
				if(str1.charAt(i)==str2.charAt(i)) cnt++;
			System.out.println("#"+t+" "+cnt);
		}
	}

}
