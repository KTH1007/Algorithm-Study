package P1201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while (true) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            }
            if (n < 0) {
                count = -1;
                break;
            }
            n -= 3;
            count++;
        }

        System.out.println(count);

    }
}
