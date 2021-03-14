import java.util.*;
class item
{
    Scanner sc = new Scanner(System.in);
    String nm = new String();
    int q;
    float cost;
    float t_cost;

    void in()
    {
        System.out.println("Enter Name, quantity and cost");
        nm=sc.next();
        q=sc.nextInt();
        cost=sc.nextFloat();
        t_cost=((float)q)*cost;
    }
    
}
class bill extends item
{
    void bill_out()
    {
        System.out.println(nm+"    "+q+"    "+"    "+cost+"    "+t_cost);
    }
}
public class q17
{
    public static void main (String args[])
    {
        bill ob[] = new bill [3];
        for(int i = 0; i<3;i++)
        {
            ob [i] = new bill();
            ob[i].in();
        }
        for(int i = 0; i<3;i++)
        {
            ob[i].bill_out();
        }
    }
}