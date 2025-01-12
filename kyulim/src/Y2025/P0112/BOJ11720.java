package Y2025.P0112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String str = br.readLine();
        int result = 0;

        for (int i = 0; i < N; i++) {
            result += (str.charAt(i) - '0');
        }
        System.out.println(result);
        br.close();
    }
}