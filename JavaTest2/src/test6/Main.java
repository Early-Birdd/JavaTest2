package test6;

import java.util.*;
public class Main {
	
	public boolean tf(int res) {
		if(res==1) {
			return false;
		}
		for(int i=2; i<res; i++) {
			if(res % i ==0) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Integer> solution(int n , int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			while(tmp>=1) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if(tf(res)) {
				answer.add(res);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x + " ");
		}
	}

}
