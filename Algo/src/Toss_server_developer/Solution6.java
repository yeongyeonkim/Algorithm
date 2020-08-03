package Toss_server_developer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6 {
	public static int result, n, m;
	public static int[][] map;
	public static int[] dx = { 0, 1, 0, -1 }, dy = { 1, 0, -1, 0 };
	public static boolean[][] visit;

	public static void move(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nx = dx[i] + x;
			int ny = dy[i] + y;
			if (0 <= nx && nx < n && 0 <= ny && ny < m) {
				if(map[nx][ny] == 0) {
					result++;
				}
				if (!visit[nx][ny] && map[nx][ny] == 1) {
					visit[nx][ny] = true;
					move(nx, ny);
				} 
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] info = input.split(";");
		n = info.length;
		String[] temp = info[0].split(" ");
		m = temp.length;
		map = new int[n][m];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(info[i]);
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean flag = false;
		visit = new boolean[n][m];
		result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1) {
					visit[i][j] = true;
					move(i, j);
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
		System.out.println(result);
	}
}
