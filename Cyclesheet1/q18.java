public class Telephone{
    long num;
    String name = new String();

    Telephone(long num, String name)
    {
        this.num=num;
        this.name = name;
    }

    void disp()
    {
        System.out.println("Name= "+name+" Number= "+num);
    }
}
public class TelephoneIndex extends Telephone
{
    void change()
    {
        int c;
        System.out.println("enter 1 to change no., 2 to change name, 3 to change both ");
        Scanner sc = new Scanner(System.in);
        c=sc.nextInt();
        switch(c)
        {
            case 1:
                {
                    System.out.println("enter new number");
                    n=sc.nextLong();
                    num=n;
                    break;
                }
            case 2:
                {
                    System.out.println("enter new name");
                    nm=sc.next();
                    name=nm;
                    break;
                }
            case 3:
                {
                    System.out.println("enter new number and then name");
                    n=sc.nextLong();
                    num=n;
                    nm=sc.next();
                    name=nm;
                    break;
                }
            default:
                break;
        }
    }
}
public class q18
{
    public static void main(String args[])
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner sc = new Scanner(System.in);
        
    }
}