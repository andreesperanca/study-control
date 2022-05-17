package class_and_object;

class Student12{  
    int id;  
    String name;

    Student12(int i,String n){  
    id = i;  
    name = n;  
    }  
    Student12(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student12 s1 = new Student12(111,"Karan");  
    Student12 s2 = new Student12();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  