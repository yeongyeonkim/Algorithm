package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] Kim = br.readLine().split(" ");
		String[] Lee = br.readLine().split(" ");
		int result = 0;
		for (int i = 0; i < Kim.length; i++) {
			int k = Integer.parseInt(Kim[i]);
			int l = Integer.parseInt(Lee[i]);
			result += k-l;
			if (result < 0) {
				System.out.print(0 + " ");
			}
			else {
				System.out.print(result + " ");
				result = 0;
			}
		}
	}
}