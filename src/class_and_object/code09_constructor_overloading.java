package class_and_object;
// Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.

class Student9{
    int id;  
    String name;  
    int age;

    Student9(int i,String n){
    	id = i;  
    	name = n;  
    }  
    Student9(int i,String n,int a){
    	id = i;  
    	name = n;  
    	age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    	Student9 s1 = new Student9(111,"Karan");
    	Student9 s2 = new Student9(222,"Aryan",25);
    	s1.display();  
    	s2.display();  
   }  
}  