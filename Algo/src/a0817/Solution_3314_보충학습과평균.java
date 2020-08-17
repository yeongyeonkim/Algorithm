package a0817;

import java.util.Scanner;

public class Solution_3314_보충학습과평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int avg = 0;
			for(int i=0; i<5; i++) {
				int num = sc.nextInt();
				if(num >= 40) avg += num;
				else avg += 40;
			}
			System.out.println("#"+t+" "+avg/5);
		}
	}

}
