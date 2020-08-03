package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution3 {

	public static void main(String[] args) throws Exception {
		// [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		ArrayList<int[]> arr = new ArrayList<>();
		String[] info = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < info.length; k++) {
			int num = Integer.parseInt(info[k]);
			boolean flag = false;
			for (int i = 0; i < arr.size(); i++) {
				int[] tmp = arr.get(i);
				if (tmp[0] == num) {
					sb.append(tmp[1]);
					flag = true;
				}
			}
			if(!flag) { // 값을 못찾은 경우
//				int result = Function.compute(num); // 함수가 내장
//				arr.add(new int[] {num, result});
//				sb.append(result);
			}
			if (k == info.length - 1) break;
			sb.append(" ");
		}
		System.out.println(sb);
	}
}