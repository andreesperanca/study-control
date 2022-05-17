package static_and_this;// Program of this keyword:
// to refer current class instance variable without this!
// they will be updated
// there is no ambiguity...
  
class Student11{
int rollno;  
String name;  
float fee;

Student11(int r,String n,float f){
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis3{  
public static void main(String args[]){  
Student11 s1=new Student11(111,"ankit",5000f);
Student11 s2=new Student11(112,"sumit",6000f);
s1.display();  
s2.display();  
}}  