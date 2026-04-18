import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 분위별 장학금
        int[] M = new int[11];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <= 10; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }

        int N = Integer.parseInt(br.readLine());
        long sum = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken());   // 분위
            double L = Double.parseDouble(st.nextToken()); // 평점 (중요!!)
            int S = Integer.parseInt(st.nextToken());   // 학점

            if (S >= 17 && L >= 2.0) {
                sum += M[B];
            }
        }

        System.out.println(sum);
    }
}