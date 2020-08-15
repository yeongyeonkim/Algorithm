package a0815;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8658_Summation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=1; t<=tc; t++) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				String num = st.nextToken();
				int sum = 0;
				for(int i=0; i<num.length(); i++) 
					sum += num.charAt(i) - '0';
				max = sum > max ? sum : max;
				min = sum < min ? sum : min;
			}
			System.out.println("#"+t+" "+max+" "+min);
		}
	}

}
