package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집합=> Array 는 최초 길이 알아야함
        // 처음 길이 몰라도 만들 수 있음
        // Array -> 정적배열
        // List(ArrayList) -> 동적배열 : 크기가 가변적으로 늘어난다.
        // - 생성 시점에 작은 연속된 공간을 요청해서 참주형 변수를 담아놓느다.
        // - 값이 추가될 떄 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니까 상관없다.

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        // 특정 인덱스 요소 값 변경
        arrayList.set(2, 10);
        System.out.println(arrayList.get(2));

        // 특정 인덱스 요소 삭제
        arrayList.remove(1);
        System.out.println(arrayList);

        // 전체값 삭제
        arrayList.clear();
        System.out.println(arrayList);


    }
}
