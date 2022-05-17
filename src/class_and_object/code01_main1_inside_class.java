package class_and_object;


 class Student1 {

  int id;//field or data member or instance variable
  String name;

  public static void main(String args[]) {
   Student1 s1 = new Student1();//creating an object of Student
   System.out.println(s1.id);//accessing member through reference variable
   System.out.println(s1.name);
  }
 }
