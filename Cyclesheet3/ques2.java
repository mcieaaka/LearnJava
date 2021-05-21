import java.util.*;
class tourist
{
    String name,state,fspot;
    tourist(String name,String state,String fspot)
    {
        this.name = name;
        this.state = state;
        this.fspot = fspot;
    }

}
class SortByState implements Comparator<tourist>
{
	@Override
	public int compare(tourist a, tourist b) {
		return a.state.compareTo(b.state);
	}
}
class NotFoundSpot extends Exception
{
    public NotFoundSpot(String s)
    {
        super(s);
    }
}
public class ques2
{
    public static void main(String args[]) throws NotFoundSpot
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        List<tourist> list = new ArrayList<tourist>();
        tourist t1 = new tourist("Mysore","Karnataka","Mysore Fort");
        tourist t2 = new tourist("Vellore","Tamil Nadu","Golden Temple");
        tourist t3 = new tourist("Kochi","Kerela","Kochi");
        tourist t4 = new tourist("Hyderabad","Andhra Pradesh","Charminar");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        Collections.sort(list, new SortByState()); 
        System.out.println("In sorted Order by State:");
	    for(tourist str: list)
        {
			System.out.println(str.state+"     "+str.fspot);
	    }
        Scanner sc= new Scanner(System.in);
        System.out.print("\nSearch the tourist spot: ");
        String spot = sc.nextLine();
        int c=0;
        Iterator ai = list.iterator();
        while(ai.hasNext())
        {
            tourist temp = (tourist)ai.next();
            if(spot.equalsIgnoreCase(temp.fspot))
            {
                System.out.println("Found: "+temp.fspot);
                c=1;
            }
        }
        if(c==0)
        {
            throw new NotFoundSpot(spot+" not found in list");
        }
    }
}