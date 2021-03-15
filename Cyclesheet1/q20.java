interface it1
{
    public void add();
    public void sub();
    public void multiply();
    public void divide();
}
class int_func implements it1
{
    int a=8,b=3;
    public void add()
    {
        System.out.println(a+b);
    }
    public void sub()
    {
        System.out.println(a-b);
    }
    public void multiply()
    {
        System.out.println(a*b);
    }
    public void divide()
    {
        System.out.println(a/b);
    }
}
class fl_func implements it1
{
    double a=4.5, b=2.4;
    public void add()
    {
        System.out.println(a+b);
    }
    public void sub()
    {
        System.out.println(a-b);
    }
    public void multiply()
    {
        System.out.println((float)a*(float)b);
    }
    public void divide()
    {
        System.out.println(a/b);
    }
}
class q20
{
    public static void main(String args[])
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        System.out.println("A=8,B=3");
        int_func ob1 = new int_func();
        ob1.add();
        ob1.sub();
        ob1.multiply();
        ob1.divide();
        System.out.println("A=4.5,B=2.4");
        fl_func ob2 = new fl_func();
        ob2.add();
        ob2.sub();
        ob2.multiply();
        ob2.divide();
    }
}