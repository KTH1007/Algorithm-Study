package Y2024.P1124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 666;
        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }

        System.out.println(num);

    }
}
