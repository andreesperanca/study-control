package super_and_final;

class Bike14{
  final void run(){System.out.println("running...");}  
}  

class Honda14 extends Bike14{
   public static void main(String args[]){

    new Honda14().run();
   }  
}  