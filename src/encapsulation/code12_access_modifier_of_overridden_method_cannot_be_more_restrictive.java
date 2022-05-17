package encapsulation;
// If you are overriding any method,
// overridden method (i.e. declared in subclass) must not be more restrictive.

class A12{
protected void msg(){System.out.println("Hello java");}
}  
  
//public
class Simple12 extends A12{
//void msg(){System.out.println("Hello java");}//C.T.Error
 public static void main(String args[]){  
   Simple12 obj=new Simple12();
   obj.msg();  
   }  
}   