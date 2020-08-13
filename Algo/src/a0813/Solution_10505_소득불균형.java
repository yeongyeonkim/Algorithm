package a0813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10505_소득불균형 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int cnt = 0;
			double sum = 0;
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				int temp = Integer.parseInt(st.nextToken());
				sum += temp;
				arr[i] = temp;
			}
			double result = sum / n;
			for(int i=0; i<n; i++) 
				if(arr[i] <= result) cnt++;
			System.out.println("#"+t+" "+cnt);
		}
	}

}
