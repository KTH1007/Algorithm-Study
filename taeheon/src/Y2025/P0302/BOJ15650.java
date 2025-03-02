package Y2025.P0302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {
    static int n;
    static int m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        arr = new int[m];

        dfs(0, 0);
        System.out.println(sb);
    }

    private static void dfs(int depth, int num) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = num; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            arr[depth] = i + 1;
            dfs(depth + 1, i);
            visited[i] = false;
        }
    }
}
