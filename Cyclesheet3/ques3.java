import java.util.*;
public class ques3
{
    public static void main(String args[])
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner sc = new Scanner(System.in);
        Queue<Float> q= new PriorityQueue<>();
        int i=0,c=0;
        float s=0;
        System.out.println("Enter Data for 12 Months");
        while(i!=12)
        {
            q.add(sc.nextFloat());
            i++;
        }
        Iterator<Float> it = q.iterator();
        while(it.hasNext())
        {
            s+=(Float)it.next();
        }
        System.out.println("Average rain = "+(s/12.0));
        Iterator<Float> it2 = q.iterator();
        while(it2.hasNext())
        {
            if(((Float)it2.next())>(s/12.0))
            {
                c++;
            }
        }
        System.out.println("Count of Months with more than avg rain= "+c);
    }
}