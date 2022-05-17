package method_overriding;

class Animal3 {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog3 extends Animal3 {
   public void move() {
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
}

//public
class TestDog3 {

   public static void main(String args[]) {
      Animal3 b = new Dog3();   // Animal reference but Dog object
      b.move();   // runs the method in Dog class
   }
}