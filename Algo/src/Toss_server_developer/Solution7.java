package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] abc = input.split("; ");
		int pointer = Integer.parseInt(abc[0]);
		String[] info = abc[1].split(" ");
		int[] address = new int[info.length];
		for(int i=0; i<address.length; i++) {
			address[i] = Integer.parseInt(info[i]);
		}
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("0; ");
		int num = address[pointer];
		while(true) {
			cnt++;
			if(num == 0) { // 주소라면
				if(cnt == 0)
					sb.append(num + " " + address[pointer + 1] + " ");
				else
					sb.append(num + " " + cnt * 2 + " ");
				pointer = address[pointer+1];
				num = address[pointer];
			}
			else {
				sb.append(num + " " + address[pointer + 1] + " ");
				break;
			}
		}
		
		while(cnt != 4) {
			cnt++;
			sb.append("0 0 ");
		}
		System.out.println(sb);
	}
}