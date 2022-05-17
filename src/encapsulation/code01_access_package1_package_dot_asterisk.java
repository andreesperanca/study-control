// A java package is a group of similar types of 
// classes, interfaces and sub-packages.

// ------------------- FILE 1 --------------------

//save by A.java  
package encapsulation;
class A0{
  public void msg(){System.out.println("Hello");}  
} 

// ------------------- FILE 2 --------------------

//save by B.java

class B0{
  public static void main(String args[]){  
   A0 obj = new A0();
   obj.msg();  
  }  
}  