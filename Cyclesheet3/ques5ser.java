import java.util.*;
import java.io.*;
class product implements Serializable
{
    String id;
    int d,l,w;
    product(String id, int d, int l, int w)
    {
        this.id = id;
        this.d = d;
        this.l = l;
        this.w = w;
    }
}
public class ques5ser
{
    public static void main(String args[])throws IOException
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner scanner = new Scanner(System.in);
        String pid;
        int diameter;
        int length;
        int weight;
        int i = 0;
        int n;
        FileOutputStream file = new FileOutputStream("file.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);

        System.out.println("Enter the number of product samples: ");
        n = scanner.nextInt();
        for(int l=0; l<n; l++)
        {
            System.out.println("Enter the details of product "+(l+1));
            pid = scanner.next();
            length = scanner.nextInt();
            diameter = scanner.nextInt();
            weight = scanner.nextInt();
            product object = new product(pid, diameter, length, weight);
            out.writeObject(object);
            out.flush();
        }
        out.close();
        file.close();
    }
}