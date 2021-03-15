import java.util.*;
class student {
    String RegNo = new String();
    String name = new String();
    String branch = new String();
    int year;
    int semester;
    int marks[]=new int [5];
    char grade[] = new char [5];
}
class q16
{
    static void details(student o)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Reg No., Name, Branch, Year, Semester, Marks in 5 subjects");
        o.RegNo = sc.next();
        o.name = sc.next();
        o.branch = sc.next();
        o.year = sc.nextInt();
        o.semester = sc.nextInt();
        for(int i=0;i<5;i++)
        {
            o.marks[i]=sc.nextInt();
        }
    }
    static void eval_grade(student o)
    {
        for (int i=0;i<5;i++)
        {
            if(o.marks[i]>=90)
                o.grade[i]='S';
            else if(o.marks[i]>=80)
                o.grade[i]='A';
            else if(o.marks[i]>=80)
                o.grade[i]='B';
            else if(o.marks[i]>=80)
                o.grade[i]='C';
            else if(o.marks[i]>=80)
                o.grade[i]='D';
            else if(o.marks[i]>=80)
                o.grade[i]='E';
            else
                o.grade[i]='F';
        }
    }
    static void disp(student o)
    {
        System.out.println("Name:         "+o.name);
        System.out.println("Register No.: "+o.RegNo);
        System.out.println("Branch:       "+o.branch);
        System.out.println("Year:         "+o.year);
        System.out.println("Semester:     "+o.semester);
        for(int i=0; i<5;i++)
        {
            System.out.println("Marks   Grade");
            System.out.println(" "+o.marks[i]+"      "+o.grade[i]);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        student s1 = new student();
        details(s1);
        eval_grade(s1);
        disp(s1);
    }
}