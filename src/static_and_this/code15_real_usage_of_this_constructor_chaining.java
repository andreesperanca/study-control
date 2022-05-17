package static_and_this;// Program of this keyword:
// The Real use of this keyword - Constructor chaining!
// The this() constructor call should be used to reuse the constructor from the constructor. 
// It maintains the chain between the constructors i.e. it is used for constructor chaining.
  
// NOTE : Call to this() must be the first statement in constructor.

class Student15{
int rollno;  
String name,course;  
float fee;

Student15(int rollno,String name,String course){
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}

Student15(int rollno,String name,String course,float fee){
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}
  
class TestThis7{  
public static void main(String args[]){  
Student15 s1=new Student15(111,"ankit","java");

Student15 s2=new Student15(112,"sumit","java",6000f);
s1.display();  
s2.display();  
}}  