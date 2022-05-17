package inheritance;

class Animal9 {
}

class Mammal9 extends Animal9 {
}

class Reptile9 extends Animal9 {
}

//public
class Dog9 extends Mammal9 {

   public static void main(String args[]) {
      Animal9 a = new Animal9();
      Mammal9 m = new Mammal9();
      Dog9 d = new Dog9();

      System.out.println(m instanceof Animal9);
      System.out.println(d instanceof Mammal9);
      System.out.println(d instanceof Animal9);
   }
}