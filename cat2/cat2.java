import java.util.*;
class TouristSpot
{
	String name;
	String state;
	TouristSpot(String n, String s)
	{
		name=n;
		state=s;
	}
}
public class cat2
{
	public static void CountState(ArrayList l)
	{
		System.out.println("States with more than 1 Tourist Spots:");
		Iterator ai = l.iterator();
		ArrayList<String> temp = new ArrayList<String>();
		while (ai.hasNext())
		{
			TouristSpot st = (TouristSpot)ai.next();
			temp.add(st.state);
		}
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < temp.size(); i++) {
            try {
                map.put(temp.get(i), map.get(temp.get(i)) + 1);
            }
            catch (Exception e) {
                map.put(temp.get(i), 1);
            }
        }
		System.out.println("\n");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + ", ");
            }
        }
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<TouristSpot> destination = new ArrayList<TouristSpot>();
		System.out.println("Enter the no.of Destinations");
		int n = sc.nextInt();
		TouristSpot obj[] = new TouristSpot[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter Name of Place then State: "+(i+1));
			String na = sc.next();
			String s = sc.next();
			obj[i] = new TouristSpot(na,s);
			destination.add(obj[i]);
		}
		CountState(destination);
	}
}