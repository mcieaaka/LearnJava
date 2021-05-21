import java.util.*;
import java.util.Map.Entry;
import java.util.List;
class Book implements Comparable<Book>
{
    String name;
    String author;
    int price;
    int nc;
    Book(String name, String author, int price, int nc)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.nc = nc;
    }
    boolean hasName(String bookName) {
      return name.equals(bookName);
   }
   @Override
   public int compareTo(Book book) {
      return book.name.compareTo(name);
   }
   @Override
   public String toString() {
      return "\n" +
      "\n\tName :\t" + name + 
      "\tAuthor :\t" + author + 
      "\tPrice :\t" + price + 
      "\tNumber of Copies :\t" + nc;
   }
   static int compare(Book bookA, Book bookB) {
      return bookA.compareTo(bookB);
   }
}

class Library {
   HashMap<Integer, ArrayList<Book>> racks = new HashMap<>();

   public void addBookToRack(Book book, int rackNo) {
      if (racks.containsKey(rackNo)) {
         if (racks.get(rackNo).size() < 5)
            racks.get(rackNo).add(book);
         else
            System.out.println("Rack cannot contain more than 5 books");
      } else
         racks.put(rackNo, new ArrayList<>(List.of(book)));
   }

   public int search(String bookName) {
      for (Entry<Integer, ArrayList<Book>> entry : racks.entrySet())
         if (entry.getValue().stream().anyMatch(book -> book.hasName(bookName)))
            return entry.getKey();
      throw new IndexOutOfBoundsException("No such Book present in the Library");
   }

   public ArrayList<Book> sort(int rackNo) {
      if (racks.containsKey(rackNo)) {
         ArrayList<Book> sortedRack = new ArrayList<>(racks.get(rackNo));
         sortedRack.sort(Book::compare);
         return sortedRack;
      }
      throw new IndexOutOfBoundsException("Library has no Rack with number specified");
   }
}
public class ques4
{
    private static final Library l = new Library();
    static void addBook() {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Rack where the Book is to be placed :\t");
        int rackNo = S.nextInt();

        System.out.println("Enter the Book Name, Author, Price, Number :\n");
        String name = S.next();
        String author = S.next();
        int price = S.nextInt();
        int numCopies = S.nextInt();
        l.addBookToRack(new Book(name, author, price, numCopies), rackNo);
    }
    public static void main(String args[])
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int ch;
            System.out.println("1.Add\n2.Search\n3.Sort\n4.Exit");
            ch= sc.nextInt();
            switch(ch)
            {
               case 1:
                  addBook();
                   break;
               case 2:
                  System.out.println("Enter Book Name");
                  String stemp = sc.next();
                  System.out.println("Book found in: "+l.search(stemp));
                  break;
               case 3:
                  System.out.println("Enter rack You want to sort");
                  int sr = sc.nextInt();
                  List<Book> sortedRack = l.sort(sr);
                  System.out.println("\nNumber of Books in the Rack :\t" + sortedRack.size());
                  sortedRack.forEach(System.out::println);
                  System.out.println();
                  break;
               case 4:
                  System.exit(0);
            }
        }
    }
}