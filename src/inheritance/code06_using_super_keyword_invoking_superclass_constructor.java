package inheritance;

class Superclass6 {
   int age;

   Superclass6(int age) {
      this.age = age; 		 
   }

   public void getAge() {
      System.out.println("The value of the variable named age in super class is: " +age);
   }
}

//public
class Subclass6 extends Superclass6 {

   Subclass6(int age) {
      super(age);
   }

   public static void main(String argd[]) {
      Subclass6 s = new Subclass6(24);
      s.getAge();
   }
}