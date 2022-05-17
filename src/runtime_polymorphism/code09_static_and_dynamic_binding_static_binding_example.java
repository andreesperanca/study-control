package runtime_polymorphism;// Connecting a method call to the method body is known as binding.
// There are two types of binding :
// 1. static/early/compile-time binding (method overloading, happens in same class)
// 2. dynamic/late/run-time binding (method overriding, happens in different class)

class Dog9{
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog9 d1=new Dog9();
  d1.eat();  
 }  
}   
