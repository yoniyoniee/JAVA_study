package week02.operator;

public class W16 {
    public static void main(String[] args) {
        int number = 0;

        while(number < 3) {
            number++;
            System.out.println(number + "출력");
        }

        // do while
        // 작업을 한 후에 while

        int number2 = 4;
        do {
            //이 로직 먼저 수행
            number2++;
            System.out.println(number + "출력");
        } while (number2 < 3);


        // break
        // 가장 가까운 블록의ㅣ for while switch문 중단

        int number3 = 4;
        do {
            number3++;
            if(number3 == 2)
                break;

            System.out.println(number + "출력");
        } while (number3 < 3);


        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
        }


        // continue 명령

        number = 0;
        while(number < 3) {
            number++;
            if (number == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number + "출력");
        }

    }
}
