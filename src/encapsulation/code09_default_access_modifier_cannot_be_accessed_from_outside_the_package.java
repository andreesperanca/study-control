// A class cannot be private or protected except nested class.

// ------------------- FILE 1 --------------------

//save by A.java  
package encapsulation;
class A9{
  void msg(){System.out.println("Hello");}  
}  

// ------------------- FILE 2 --------------------

//save by B.java
class B9{
  public static void main(String args[]){  
   A9 obj = new A9();//Compile Time Error
   obj.msg();//Compile Time Error  
  }  
}  