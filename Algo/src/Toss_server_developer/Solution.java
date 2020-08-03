package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		boolean flag = true;
		if(num.length() == 1) {
			if(num.charAt(0) == '1') flag = false;
			System.out.println(flag);
			return;
		}
		for(int i=0; i<num.length() - 1; i++) {
			char now = num.charAt(i);
			char next = num.charAt(i+1);
			if(now == '1') {
				if(next == '1') {
					flag = false;
					break;
				} 
			}
		}
		if(num.charAt(num.length() - 1) == '1') flag = false;
		
		System.out.println(flag);
	}
}