package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i + " " + i*j);
            }
        }
    }
}
