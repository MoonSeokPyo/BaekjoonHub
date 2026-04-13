import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		func_1991();
		
		br.close();
		bw.close();
	}
	
	static void func_1991() throws Exception {
		int n = Integer.parseInt(br.readLine());
		Map<Character, char[]> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char node = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			map.put(node, new char[] {left, right});
		}
		StringBuilder preorder = new StringBuilder();
		StringBuilder inorder = new StringBuilder();
		StringBuilder postorder = new StringBuilder();
		func_1991_solve(map, preorder, inorder, postorder, 'A');
		bw.write(preorder.toString() + "\n");
		bw.write(inorder.toString() + "\n");
		bw.write(postorder.toString() + "\n");
	}
	static void func_1991_solve(Map<Character, char[]> map, StringBuilder preorder, StringBuilder inorder, StringBuilder postorder, char node) {
		char left = map.get(node)[0];
		char right = map.get(node)[1];
		preorder.append(node);
		if (left != '.')
			func_1991_solve(map, preorder, inorder, postorder, left);
		inorder.append(node);
		if (right != '.')
			func_1991_solve(map, preorder, inorder, postorder, right);
		postorder.append(node);
	}
}