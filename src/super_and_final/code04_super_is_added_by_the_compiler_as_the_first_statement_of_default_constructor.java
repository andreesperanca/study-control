package super_and_final;

class Animal5 {
    Animal5() {
        System.out.println("animal is created");
    }
}

class Dog5 extends Animal5 {
    Dog5() {
        super();
        System.out.println("dog is created");
    }
}

class TestSuper4 {
    public static void main(String args[]) {
        Dog5 d = new Dog5();
    }
}