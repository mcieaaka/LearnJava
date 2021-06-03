import java.util.*;
class NotEnoughLeaveBalanceException extends Exception{
     NotEnoughLeaveBalanceException(String s){  
        super(s);  
    }  
}
class NumofDaysExceedException extends Exception{
     NumofDaysExceedException(String s){  
        super(s);  
    }  
}
class employee{
    String name;
    int age;
    String date;
    int experience;
    int leaveb;
    employee(String name, int age, String date,int experience){
        this.name = name;
        this.age = age;
        this.date = date;
        this.experience = experience;
        if(experience>10){
            this.leaveb =12;
        }else{
            this.leaveb =10;
        }
    }

    int applyLeave(int apply){
        int c=0;
        try{
            if(apply<=leaveb && apply<=3){
                c=1;
                leaveb = leaveb-apply;
                System.out.println(leaveb);
            }else if(leaveb==0){
                throw new NotEnoughLeaveBalanceException("Leave Balance Not Enough");
            }else if(apply>leaveb){
                throw new NumofDaysExceedException("Leave applied exceeds Leave Balance! Not Allowed");
            }else if(apply>3){
                throw new NumofDaysExceedException("Leave should be less than or equal to 3 days");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        if(c==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
public class ques
{
    public static void main(String[] args)
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner sc = new Scanner(System.in);
        int ch;
        //CREATING AN EMPLOYEE WITH NAME, AGE, DATE OF JOINING AND YEARS OF EXPERIENCE:
        employee ob = new employee("Harshit",40,"12-06-2006",15);
        ArrayList<employee> l = new ArrayList<employee>();
        while(true){
            System.out.println("Enter \n1.Apply Leave\n2.Leave Status\n3.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter No. of Days");
                    int n = sc.nextInt();
                    int ls = ob.applyLeave(n);
                    if(ls==0)
                    {
                        System.out.println("Leave Not Approved");
                    }else{
                        System.out.println("Leave Approved");
                    }
                    l.add(ob);
                    break;
                case 2:
                    Iterator ai = l.iterator();
                    while(ai.hasNext()){
                        employee temp = (employee)ai.next();
                        System.out.println("Name:"+temp.name+" Leave Balance= "+temp.leaveb);
                    }
                    break;
                case 3:
                    System.exit(1);
            }
        }
    }
}