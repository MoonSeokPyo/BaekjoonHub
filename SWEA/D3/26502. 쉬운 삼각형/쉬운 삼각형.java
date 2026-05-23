import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main (String[] args) throws Exception {
		func_26502();
		
		br.close();
		bw.close();
	}
	
	static void func_26502() throws Exception {
		 StringBuilder sb = new StringBuilder();

    int testcase = Integer.parseInt(br.readLine());

    for (int tc = 1; tc <= testcase; tc++) {

        int n = Integer.parseInt(br.readLine());

        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int xLen = 0;
            int yLen = 0;

            for (int j = 0; j < n; j++) {

                if (points[i][0] == points[j][0]) {
                    xLen = Math.max(
                        xLen,
                        Math.abs(points[i][1] - points[j][1])
                    );
                }

                if (points[i][1] == points[j][1]) {
                    yLen = Math.max(
                        yLen,
                        Math.abs(points[i][0] - points[j][0])
                    );
                }
            }

            maxArea = Math.max(maxArea, xLen * yLen);
        }

        sb.append(maxArea).append('\n');
    }

    bw.write(sb.toString());
	}
}