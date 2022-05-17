package class_and_object;
// There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.

class Student10{
    int id;  
    String name;

    Student10(int i,String n){
    id = i;  
    name = n;  
    }  
      
    Student10(Student10 s){
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student10 s1 = new Student10(111,"Karan");
    Student10 s2 = new Student10(s1);
    s1.display();  
    s2.display();  
   }  
}  