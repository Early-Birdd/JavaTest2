package test8;

//import java.util.*;
//public class Main {
//
//	public ArrayList<Integer> solution(int n, int[] arr){
//		ArrayList<Integer> answer = new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			int cnt = 1;
//			for(int j=0; j<n; j++) {
//				if(arr[j]>arr[i]) {
//					cnt++;
//				}
//			}
//			answer.add(cnt);
//		}
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<n; i++) {
//			arr[i] = in.nextInt();
//		}
//		for(int x : T.solution(n, arr)){
//			System.out.print(x + " ");
//		}
//	}
//
//}

import java.util.*;
public class Main {

	public int[] solution(int n, int[] arr){
		int[] answer = new int[n];
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j]>arr[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;
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
		for(int x : T.solution(n, arr)){
			System.out.print(x + " ");
		}
	}

}

