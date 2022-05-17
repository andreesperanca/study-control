package static_and_this;// Program of this keyword:
// to invoke current class default constructor!
  
class A13{
A13(){System.out.println("hello a");}
A13(int x){
this();  
System.out.println(x);  
}  
}  

class TestThis5{  
public static void main(String args[]){  
A13 a=new A13(10);
}}  