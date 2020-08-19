package a0819;

import java.util.Scanner;

public class Solution_7102_준홍이의카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int[] cnt = new int[41];
			int n = sc.nextInt();
			int m = sc.nextInt();
			int max = 0;
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
					int num = i+j;
					cnt[num]++;
					max = max > cnt[num] ? max : cnt[num];
				}
			}
			System.out.print("#"+t);
			for(int i=2; i<=n+m; i++) {
				if(cnt[i]==max) System.out.print(" "+i);
			}
			System.out.println();
		}
	}

}
