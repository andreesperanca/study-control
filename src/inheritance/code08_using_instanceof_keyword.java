package inheritance;

interface Animal8{}
class Mammal8 implements Animal8{}

//public
class Dog8 extends Mammal8 {

   public static void main(String args[]) {
      Mammal8 m = new Mammal8();
      Dog8 d = new Dog8();

      System.out.println(m instanceof Animal8);
      System.out.println(d instanceof Mammal8);
      System.out.println(d instanceof Animal8);
   }
}