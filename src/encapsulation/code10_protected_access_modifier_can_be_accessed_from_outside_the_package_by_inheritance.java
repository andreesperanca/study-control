// A class cannot be private or protected except nested class.

// ------------------- FILE 1 --------------------

//save by A.java  
package encapsulation;
class A10{
protected void msg(){System.out.println("Hello");}  
}   

// ------------------- FILE 2 --------------------

//save by B.java  

class B10 extends A10{
  public static void main(String args[]){  
   B10 obj = new B10();
   obj.msg();  
  }  
}  