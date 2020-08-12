package a0812;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_8673_코딩토너먼트1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int sum = 0;
			int k = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<Math.pow(2, k); i++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			for(int i=k; i>0; i--) {
				int cnt = (int)(Math.pow(2, i) / 2);
				while(cnt > 0) {
					int a = q.poll();
					int b = q.poll();
					if(a > b) {
						sum += a - b;
						q.add(a);
					} else {
						sum += b - a;
						q.add(b);
					}
					cnt--;
				}
			}
			System.out.println("#"+t+" "+sum);
		}
	}

}
