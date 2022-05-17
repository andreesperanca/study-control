package encapsulation;// The private access modifier is accessible only within class.

class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
//}

//public class Simple1 {
    public static void main(String args[]) {
        A obj = new A();
     //   System.out.println(obj.data);//Compile Time Error
      //  obj.msg();//Compile Time Error
    }
}  