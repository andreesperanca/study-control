package class_and_object;
// Constructor in java is a special type of method that is used to initialize the object.
// A constructor that have no parameter is known as default constructor.

class Student7{
 int id;  
 String name;  
  
 void display(){System.out.println(id+" "+name);}  
  
 public static void main(String args[]){  

  Student7 s1=new Student7();
  Student7 s2=new Student7();

  s1.display();  
  s2.display();  
 }  
}