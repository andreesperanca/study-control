package inner_class;

abstract class AnonymousInner4 {
   public abstract void mymethod();
}

//public
class Outer_class {

   public static void main(String args[]) {
      AnonymousInner4 inner = new AnonymousInner4() {
         @Override
         public void mymethod() {
            System.out.println("This a example of anonymous inner class");
         }
      };
      inner.mymethod();	
   }
}