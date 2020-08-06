package a0806;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6730_장애물경주난이도 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=testcase; tc++) {
			int up = 0, down = 0;
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int now = Integer.parseInt(st.nextToken());
			int next = 0, sum = 0;
			for(int i=0; i<n-1; i++) {
				next = Integer.parseInt(st.nextToken());
				sum = now - next; //음수면 오르막 양수면 내리막
				if(sum > 0) down = sum > down ? sum : down;
				else up = -sum > up ? -sum : up;
				now = next;
			}
			
			System.out.println("#"+tc+" "+up+" "+down);
		}
	}
}
