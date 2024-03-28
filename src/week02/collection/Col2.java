package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList);

        linkedList.add(2, 5);
        System.out.println(linkedList.toString());

        linkedList.set(1, 10);
        System.out.println(linkedList);

        linkedList.remove(0);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
