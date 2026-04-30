/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;
import java.math.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_1244();
		br.close();
		bw.close();
	}
	static void func_1244() throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 1; i <= t; i++) {
			sb.append('#').append(i).append(' ');
			StringTokenizer st = new StringTokenizer(br.readLine());
			char[] arr = st.nextToken().toCharArray();
			int cnt = Integer.parseInt(st.nextToken());
			HashSet <String>[] set = new HashSet[cnt + 1];
			for (int j = 1; j <= cnt; j++) {
				set[j] = new HashSet<>();
			}
			sb.append(func_1244_dfs(arr, set, cnt)).append('\n');
		}
		bw.write(sb.toString());
	}
	static int func_1244_dfs(char[] arr, HashSet<String>[] visited, int cnt) {
		if (cnt == 0) {
			return Integer.parseInt(String.valueOf(arr));
		}
		int max = Integer.MIN_VALUE;
		String n = String.valueOf(arr);
		if(visited[cnt].contains(n))
			return max;
		visited[cnt].add(n);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				char tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				max = Math.max(max, func_1244_dfs(arr, visited, cnt - 1));
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		return max;
	}
}