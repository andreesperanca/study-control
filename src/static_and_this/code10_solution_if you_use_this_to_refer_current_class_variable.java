package static_and_this;// Program of this keyword:
// to refer current class instance variable with this!
// they will be updated
// there is no ambiguity...
  
class Student10{
int rollno;  
String name;  
float fee;  
Student10(int rollno,String name,float fee){
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student10 s1=new Student10(111,"ankit",5000f);
Student10 s2=new Student10(112,"sumit",6000f);
s1.display();  
s2.display();  
}}  