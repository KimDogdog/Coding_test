package Coding_test;

import java.util.Scanner;

public class N_lunch_Game {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int start = 0;

        char[] arr = new char[m * t]; //숫자들의 진법이 들어갈 배열

        for (int i = 0; i < arr.length; ) {

            //n진수로 변환
            String trans = Integer.toString(start, n);

            for (int j = 0; j < trans.length(); j++) {
                if (i + j == arr.length) break;
                arr[i + j] = trans.charAt(j);
            }

            i += (trans.length());

            start++;
        }

        for (int i = p - 1; i < arr.length; i += m) {

            answer = answer.concat((String.valueOf(arr[i])).toUpperCase());
            if (answer.length() == t) break;
        }

        return answer;
    }
}
