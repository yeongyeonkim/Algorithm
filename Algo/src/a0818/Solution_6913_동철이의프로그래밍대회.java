package a0818;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6913_동철이의프로그래밍대회 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int top = 0, cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			for(int i=0; i<n; i++) {
				int tmp = 0;
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					if(Integer.parseInt(st.nextToken()) == 1) {
						tmp++;
					}
				}
				if(tmp > top) {
					top = tmp;
					cnt = 1;
				} else if(tmp == top) {
					cnt++;
				}
			}
			System.out.println("#"+t+" "+cnt+" "+top);
		}
	}
}