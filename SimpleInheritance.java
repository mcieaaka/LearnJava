class A {
int i;
void showi() {
System.out.println("i: " + i);
}
}

class B extends A {
int j;
void showj() {
System.out.println("j: " + j);
}
void sum() {
System.out.println("i+j: " + (i+j));
}
}

class SimpleInheritance {
public static void main(String args[]) {
A a = new A();
B b = new B();
a.i = 10;
System.out.println("Contents of a: ");
a.showi();
b.i = 7; b.j = 8;
System.out.println("Contents of b: ");
b.showi(); b.showj();
System.out.println("Sum of I and j in b:");
b.sum();
}
}