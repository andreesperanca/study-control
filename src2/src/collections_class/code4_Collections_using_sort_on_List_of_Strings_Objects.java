package collections_class;

import java.util.*;
class TestSort1{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Airu");
al.add("Aaurav");
al.add("Cukesh");
al.add("Bahir");
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  