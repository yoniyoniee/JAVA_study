package week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        for (int i = 2; i<=9; i++) {
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println( i + "*" + j + "=" + i*j);
            }
        }
    }
}
