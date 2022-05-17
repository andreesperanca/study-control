// A java package is a group of similar types of 
// classes, interfaces and sub-packages.

// ------------------- FILE 1 --------------------

//save by A.java  
package encapsulation;

class A3 {
    public void msg() {
        System.out.println("Hello");
    }
}

// ------------------- FILE 2 --------------------

//save by B.java
class B {
    public static void main(String args[]) {
        A3 obj = new A3();//using fully qualified name
        obj.msg();
    }
}   