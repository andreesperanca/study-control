package class_and_object;
// Constructor in java is a special type of method that is used to initialize the object.

class Student8 {
    int id;  
    String name;  
      
    Student8(int i,String n){
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){

    Student8 s1 = new Student8(111,"Karan");
    Student8 s2 = new Student8(222,"Aryan");
    s1.display();  
    s2.display();

   }  
}  