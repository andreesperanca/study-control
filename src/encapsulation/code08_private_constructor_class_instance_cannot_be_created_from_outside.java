package encapsulation;// If you make any class constructor private,
// you cannot create the instance of that class from outside the class.

class A8 {
    private A8() {
    }//private constructor

    void msg() {
        System.out.println("Hello java");
    }
}

class Simple8 {
    public static void main(String args[]) {
      //  A8 obj = new A8();//Compile Time Error
    }
}  