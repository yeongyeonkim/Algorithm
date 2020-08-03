package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] info = input.split(" ");
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0; i<info.length; i++) {
			arr.clear();
			int cnt = 0;
			StringBuilder sb = new StringBuilder();
			for(int j=i; j>=0; j--) {
				if(cnt == 5) break;
				String bank = info[j];
				if(arr.contains(bank)) {
					continue;
				} else {
					cnt++;
					sb.append(bank);
					arr.add(bank);
				}
				sb.append(" ");
			}
			System.out.println(sb);
		}
	}
}
