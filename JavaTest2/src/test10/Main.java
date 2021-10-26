package test10;

import java.util.*;
public class Main {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int a[] = {-1, 0, 1, 0};
		int b[] = {0, 1, 0, -1};
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean fl = true;
				for(int k=0; k<4; k++) {
					int nx = i + a[k];
					int ny = j + b[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[i][j]<=arr[nx][ny]) {
						fl = false;
						break;
					}
				}
				if(fl) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T =new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}

}
