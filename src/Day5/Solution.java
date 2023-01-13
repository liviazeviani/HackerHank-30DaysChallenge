package Day5;

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        int result;
        for (i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        bufferedReader.close();


    }
}