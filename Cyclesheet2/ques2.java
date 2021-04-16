import java.util.*;
class employee{
    String name;
    String empID;
    String year;
    employee(String name, String empID, String year)
    {
        this.name = name;
        this.empID = empID;
        this.year = year;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Employee Id: "+empID);
        System.out.println("Year of Birth: "+year);
    }
}
class InvalidEmpCodeException extends Exception{
     InvalidEmpCodeException(String s){  
        super(s);  
    }  
}
public class ques2
{
    public static void main(String[] args)
    {
        System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Id and Year of Birth: ");
        String n = sc.next();
        String e = sc.next();
        String y = sc.next();
        int c =0;
        try{
            if(e.substring(0,2)!=y.substring(2))
            {
                c++;
            }
            if(!(e.charAt(2)=='S'||e.charAt(2)=='F'))
            {
                c++;
            }
            for(int i=3;i<6;i++)
            {
                if(Character.isDigit(e.charAt(i)))
                {
                    continue;
                }else{
                    c++;
                }
            }

            if(c==0)
                throw new InvalidEmpCodeException("Invalid ID");
            else
            {
                System.out.println("Valid ID!");
                employee ob = new employee(n,e,y);
                ob.display();
            }
        }catch(Exception m){
            System.out.println(m);
        }
    }
}