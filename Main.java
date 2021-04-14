class Base {    
 public void Print() {         
System.out.println("Base");     }          }   
class Derived1 extends Base {         
public void Print() {        
System.out.println("Derived1");     } }     
class Derived2 extends Base { 
public void Print() {
System.out.println("Derived2");
    }
}
class Main{
public static void DoPrint(Base o) { o.Print(); }   
public static void main(String args[]) 
{ Base s=new Base(); 
Derived2 d2=new Derived2();
Derived1 d1=new Derived1(); 
DoPrint(s);
DoPrint(d2); 
DoPrint(d1); }}