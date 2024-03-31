package week04.gen;

public class Generic<T>{

    private T t;

    public T get() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.setT("Helllo Generic");
        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);

    }
}
