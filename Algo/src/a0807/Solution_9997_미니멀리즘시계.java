package a0807;

import java.util.Scanner;

public class Solution_9997_미니멀리즘시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t= 1; t<=tc; t++) {
			int d = sc.nextInt()*2;
			System.out.println("#"+t+" "+d/60+" "+d%60);
		}
	}

}
