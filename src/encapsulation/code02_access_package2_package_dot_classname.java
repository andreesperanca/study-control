// A java package is a group of similar types of 
// classes, interfaces and sub-packages.

// ------------------- FILE 1 --------------------

//save by A.java  
  
package encapsulation;
class A1{
  public void msg(){System.out.println("Hello");}  
}  

// ------------------- FILE 2 --------------------

//save by B.java  

class B2{
  public static void main(String args[]){  
   A1 obj = new A1();
   obj.msg();  
  }  
}    