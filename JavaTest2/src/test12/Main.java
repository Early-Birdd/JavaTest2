package test12;

import java.util.*;
public class Main {

	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt = 0;
				for(int k=0; k<m; k++) {
					int ir=0;
					int jr=0;
					for(int p=0; p<n; p++) {
						if(arr[k][p]==i) {
							ir = p;
						}
						if(arr[k][p]==j) {
							jr = p;
						}
					}
					if(ir<jr) {
						cnt++;
					}
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}
