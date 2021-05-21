import java.util.*;
 
class Book {
 String name;
 String auth;
 int price;
 int num;
 
 Book(String na, String a, int p, int n) {
   name = na;
   auth = a;
   price = p;
   num = n;
 }
}
public class ques4b {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, List<Book>> h = new HashMap<>();
        System.out.print("Number of rack:");
        int no_rack = in.nextInt();
        for (int i = 0; i < no_rack; i++) {
            System.out.print("Num of books in rack " + (i + 1) + "(max 5): ");
            int no_book = in.nextInt();
            in.nextLine();
            if (no_book <= 5) {
            List<Book> l = new ArrayList<>();
            for (int j = 0; j < no_book; j++) {
                System.out.print("Book Name: ");
                String name = in.nextLine();
                System.out.print("Book Author: ");
                String auth = in.nextLine();
                System.out.print("Book Price: ");
                int price = in.nextInt();
                in.nextLine();
                System.out.print("Book Num. of Copies: ");
                int num = in.nextInt();
                in.nextLine();
                l.add(new Book(name, auth, price, num));
                System.out.println("Book " + name + " Added");
            }
            h.put(i + 1, l);
            } else
            i--;
        }
        System.out.println("\n**Searching a Book**");
        System.out.println("Enter book to be searched:");
        String book = in.nextLine();
        System.out.println("Rack of book:" + search(book, h));
        System.out.println("**Sorting a Book Rack**");
        System.out.println("Enter Rack to display book name:");
        int s = in.nextInt();
        sort(s, h);
    }
    
    static int search(String book, HashMap<Integer, List<Book>> h) {
    for (Map.Entry<Integer, List<Book>> e : h.entrySet()) {
        List<Book> l = e.getValue();
        for (int i = 0; i < l.size(); i++) {
        String temp = l.get(i).name;
        if (temp.equals(book)) {
            return e.getKey();
        }
        }
    }
    return -1;
    }
    
    static void sort(int s, HashMap<Integer, List<Book>> h) {
    for (Map.Entry<Integer, List<Book>> e : h.entrySet()) {
        if (e.getKey() == s) {
        List<Book> l = e.getValue();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).name);
        }
        }
    }
    }
}
