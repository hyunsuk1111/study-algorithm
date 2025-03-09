package org.example.평균구하기;

import java.util.Scanner;

public class 평균 {

    public static void main(String[] args) {
        //변수 N에 과목의 수 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //길이가 N인 1차원배열에 점수 저장하기
        int[] a = new int[n];

        //최고점
        long max = 0;
        long sum = 0;

        //배열에 점수 저장하기
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //최고점 찾기 및 총합 구하기
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
            sum += a[i];
        }
        
        //값 출력
        System.out.println("data : "  + ((double) sum * 100 / max / n));
    }
}
