import java.util.Scanner;
 class Telephone {
    String name;
    String phone;
}
class TelephoneIndex extends Telephone{
    TelephoneIndex(String x,String y)
    {
        name=x;
        phone=y;
    }
    void change_name()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter new name: ");
        name = sc.nextLine();
    }
    void change_number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter new number: ");
        phone = sc.nextLine();
    }

    String Get()
    {
        return (name+"\t"+phone+"\n");
    }
}
class q18 {
    public static void main(String[] arg)
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner s=new Scanner(System.in);
        TelephoneIndex[] ti=new TelephoneIndex[3];
        int i;
        for (i=0;i<3;i++)
        {
            System.out.print("Name: ");
            String x= s.nextLine();
            System.out.print("Number: ");
            String y=s.nextLine();
            ti[i]=new TelephoneIndex(x,y);
        }
        String find,flsh;
        //flsh=s.nextLine();
        find= s.nextLine();
        for (i=0;i<3;i++)
        {
            if (ti[i].Get().startsWith(find))
                System.out.print("\n"+ti[i].Get());
        }
        System.out.println("Enter the index of Detail you want to change");
        int index=s.nextInt();
        flsh=s.nextLine();
        ti[index].change_name();
        ti[index].change_number();
        for (i=0;i<3;i++)
            System.out.print("\n"+ti[i].Get());
    }
}