import java.io.*;
import java.util.*;

public class ques5
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        ArrayList<String> list = new ArrayList<>();
        FileInputStream file = new FileInputStream("file.txt");
        ObjectInputStream in = new ObjectInputStream(file);
        product object2=null;
        try
        {
            int i=0;
            while(i!=5)
            {
                object2 = (product) in.readObject();
                if (object2.l != 10 || object2.d != 3 || object2.w != 100)
                {
                    list.add((object2.id).toString());
                }
                i++;
            }
            in.close();
            file.close();
        }
        catch (ClassNotFoundException ex)
        {
        System.out.println("ClassNotFoundException is caught");
        }
        System.out.println("The product id of defective sample is:");
        for(String j:list)
        {
        System.out.println(j);
        }
    }
}