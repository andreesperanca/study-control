// A class cannot be private or protected except nested class.

// ------------------- FILE 1 --------------------

//save by A.java  
  
package encapsulation;
//public
class A11{
public void msg(){System.out.println("Hello");}  
}   

// ------------------- FILE 2 --------------------

//save by B.java  

class B11 {
  public static void main(String args[]){  
   A11 obj = new A11();
   obj.msg();  
  }  
}  