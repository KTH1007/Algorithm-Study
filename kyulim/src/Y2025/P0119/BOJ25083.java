package Y2025.P0119;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ25083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "         ,r'\"7\n" +
            "r`-_   ,'  ,/\n" +
            " \\. \". L_r'\n" +
            "   `~\\/\n" +
            "      |\n" +
            "      |";

        System.out.print(str);

        br.close();
        bw.flush();
        bw.close();
    }
}
