package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(11);
        intSet.add(18);
        intSet.add(11);
        intSet.add(18);

        for (Integer value: intSet) {
            System.out.println(value);
        }

        // contains
        System.out.println(intSet.contains(12));

    }
}
