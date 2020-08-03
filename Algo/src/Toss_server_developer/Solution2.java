package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean[] visit = new boolean[46];
		int max = 0;
		String[] info = input.split(" ");
		boolean flag = true;
		if(info.length != 6) {
			System.out.println("false");
			return;
		}
		for(int i=0; i<6; i++) {
			int num = Integer.parseInt(info[i]);
			if(num < 1 || num > 45) {
				flag = false;
				break;
			}
			if(max > num) {
				flag = false;
				break;
			} else {
				max = num;
			}
			if(!visit[num])
				visit[num] = true;
			else {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
