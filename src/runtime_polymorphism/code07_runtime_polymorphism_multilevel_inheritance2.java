package runtime_polymorphism;
// Runtime polymorphism or Dynamic Method Dispatch is a process in which
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Animal7{
    void run(){}
void eat(){System.out.println("animal is eating...");}  
}  
class Dog7 extends Animal7{
void eat(){System.out.println("dog is eating...");}
void run(){}
}  
class BabyDog17 extends Dog7{
    void run(){}

public static void main(String args[]){  
Animal7 a= new BabyDog17();
a.eat();  
}
}