package Abstraction;

  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle1{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle11{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestWithoutAbstraction{  
public static void main(String args[]){  
Circle11 s=new Circle11();//In real scenario, object is provided through method e.g. getShape() method  
s.draw();  
}  
}  
