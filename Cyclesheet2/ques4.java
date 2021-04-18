import java.util.*;
class customTimeException extends Exception{
        private double timeofDay;
        public customTimeException(double timeofDay) {
                this.timeofDay = timeofDay;
        }
        public String toString(){
                String msg = null;
                if(timeofDay >=5 && timeofDay < 12) {
                        msg = "Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking";
                }
                else if(timeofDay >=12 && timeofDay < 17) {
                        msg = "its Day Time, after lunch have tablet to avoid sleep";
                }
                else if(timeofDay >=17 && timeofDay < 18.30) {
                        msg = "Hello, Good Evening have a dinner";
                }
                else {
                        msg = "Night, Go for sleep";
                }
                return msg;
        }
}
public class ques4 {
        public static void main(String args[]){
                System.out.println("Harshit Srivastava 19BCE0382");
                double timeInHours;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter current time in hours : ");
                timeInHours = sc.nextDouble();
                System.out.println();
                try{
                        throw new customTimeException(timeInHours);
                }
                catch(customTimeException e){
                        System.out.println(e) ;
                }
        }
}
