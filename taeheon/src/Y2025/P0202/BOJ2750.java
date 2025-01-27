package Y2025.P0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(null);
        StringBuilder sb = new StringBuilder();

        for (Integer i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
