package a0805;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1289_원재의메모리복구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=testcase;tc++) {
			int result = 0;
			String str = br.readLine();
			char now = str.charAt(0);
			if(now == '1') result++;
			char next;
			for(int i=1; i<str.length(); i++) {
				next = str.charAt(i);
				if(now != next) {
					result++;
					now = next;
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}
