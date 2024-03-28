package week03.interfaceTypeExample2;

public class Main {

    public static void main(String[] args) {
        A a1 = new B();
        a1.a();

        B b = (B) a1;
        b.b();
        b.a();

        A a2 = new C();
        a2.a();

        C c = (C) a2;
        c.a();
        c.b();
        c.c();
    }


}

interface A {
    void a();
}

class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}

class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
