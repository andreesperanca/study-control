package interfaces;// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Since Java 8, we can have method body in interface. 
// But we need to make it default or static method.

interface Drawable8{
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle8 implements Drawable8{
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic {
public static void main(String args[]){  
Drawable8 d=new Rectangle8();
d.draw();  
System.out.println(Drawable8.cube(3));
}}  