package runtime_polymorphism;// Runtime polymorphism or Dynamic Method Dispatch is a process in which
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Bike5{
 int speedlimit=90;  
}  
class Honda3 extends Bike5 {
 int speedlimit = 150;

 public static void main(String args[]) {
  Bike5 obj = new Honda3();
  System.out.println(obj.speedlimit);//90  
 }
}