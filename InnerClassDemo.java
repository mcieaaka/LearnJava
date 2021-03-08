/*class Outer {
int outer_x = 100;
void test() {
Inner inner = new Inner();
inner.display();
}
class Inner {
void display() {
System.out.println("outer_x = " + outer_x);
}
}
}*/
class Outer {
int outer_x = 100;
void test() {
for (int i=0; i<10; i++) {
class Inner {
void display() {
System.out.println("outer_x= " + outer_x);
}
}
Inner inner = new Inner();
inner.display();
}
}
}

class InnerClassDemo {
public static void main(String args[]) {
Outer outer = new Outer();
outer.test();
}
}