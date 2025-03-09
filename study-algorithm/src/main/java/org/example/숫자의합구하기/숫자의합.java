package org.example.숫자의합구하기;

import java.util.Scanner;

public class 숫자의합 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 시작 시간 기록

        //N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성해라
        //입력
        //1번째 줄에 숫자의 개수, 2번째 줄에 숫자 N개가 공백없이 주어진다.

        int result = 0;

        //N값 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //길이 n의 숫자를 입력받아 String형 변수 sNum에 저장
        String sNum = sc.next();

        //sNum을 다시 char[]형 변수 cNum에 변환하여 저장
        char[] cNum = sNum.toCharArray();

        for (int i = 0; i < cNum.length; i++) {
            result += cNum[i] + '0';
        }

        System.out.println("result = " + result);

        long endTime = System.currentTimeMillis(); // 끝 시간 기록
        long timeTaken = endTime - startTime; // 실행 시간 계산

        System.out.println("Execution time: " + timeTaken + " milliseconds");

    }
}
