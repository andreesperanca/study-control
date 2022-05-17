package abstraction;// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)
// Abstract class needs to be extended and its method implemented. 
// It cannot be instantiated.

//example of abstract class that have method body  

 abstract class Bike1{
   Bike1(){System.out.println("bike is created");}
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}
 }  
  
 class Honda extends Bike1{
 void run(){System.out.println("running safely..");}  
 }

 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike1 obj = new Honda();
  obj.run();  
  obj.changeGear();  
 }  
}  