package static_and_this;// Program of this keyword:
// to invoke current class parameterised constructor!

class A14 {
    A14() {
        this(5, 9);
        System.out.println("hello a");
    }

    A14(int x, int y) {
        System.out.println(x + y);
    }

    A14(int x) {
        System.out.println(x);
    }
}

class TestThis6 {
    public static void main(String args[]) {
        A14 a = new A14();
    }
}