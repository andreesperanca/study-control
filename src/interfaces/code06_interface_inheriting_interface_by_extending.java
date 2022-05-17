package interfaces;// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Inheriting multiple interfaces with same methods has no ambiguity problem
// unlike inheriting multiple classes. 
// That is why multiple inheritance is not allowed in Java through classes

interface Printable6{
void print();  
}

interface Showable6 extends Printable6{
void show();

}  
class TestInterface4 implements Showable6 {
 public void print() {
  System.out.println("Hello");
 }

 public void show() {
  System.out.println("Welcome");
 }

 static class Testes extends TestInterface4 {
  @Override
  public void print() {
   super.print();
   System.out.println("BASICA");
  }
 }

 public static void main(String args[]) {
  TestInterface4 obj = new TestInterface4();
  obj.print();
  obj.show();
 }
}