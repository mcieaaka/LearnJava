/*Define a class vector (not the predefined class in Java) with the following instance
        variables
        a) x, the magnitude of the vector along the ‘x’ direction
        b) y, the magnitude of the vector along the ‘y’ direction
        c) z, the magnitude of the vector along the ‘z’ direction
        Define three constructors (i) to assign 1 for all the three components of the vector (ii)
        to assign user defined values for x and y components (ii) to assign user defined values
        for all the three components. The third constructor should reuse the code of second
        constructor. Create two vector objects ‘u’ and ‘v’ to work in two dimensions. i.e. x and
        y values alone should be considered.
        Create two more objects ‘U’ and ‘V’ having all three components, so as to work in three
        dimensions. Define a method named dotProduct() to compute the dot product of two
        2D vectors as follows,
        If vector object u=xi+yj and v=xi+yj then u.v=(u.x).(v.x)+(u.y).(v.y)
        Overload this method for finding the dot product of two 3D vectors as follows:
        If U=xi+yj+zk and V=xi+yj+zk then U.V= (u.x).(v.x)+(u.y).(v.y)+(u.z).(v.z)
        Define another method computeAngle() to find the angle between the two vectors as,*/
import java.util.*;
import java.lang.*;
import java.lang.Math;
class vector{
        int x,y,z;
        vector(){
                x=1;
                y=1;
                z=1;
        }
        vector(int x,int y){
                this.x=x;
                this.y=y;
                this.z=0;
        }
        vector(int x,int y,int z){
                this.x=x;
                this.y=y;
                this.z=z;
        }
}
public class shivoma {
        static void dotproduct(int a1, int a2, int b1, int b2)
        {
                int dp = (a1*b1)+(a2*b2);
                System.out.println("2D dot product= "+dp);
        }
        static void dotproduct(int a1, int a2, int a3, int b1, int b2, int b3)
        {
                int dp2 = (a1*b1)+(a2*b2)+(a3*b3);
                System.out.println("3D dot product= "+dp2);
        }
        static void computeAngle(vector a, vector b)
        {
                int dp = (a.x*b.x)+(a.y*b.y)+(a.z*b.z);
                double am = Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
                double bm = Math.sqrt(b.x*b.x + b.y*b.y + b.z*b.z);
                double angle = Math.acos(dp/(am*bm));
                if(a.z==0&&b.z==0){
                        System.out.println("Angle(in radians) between 2d vectors= "+angle);
                }else{
                        System.out.println("Angle(in radians) between 3d vectors= "+angle);
                }
        }
        public static void main(String args[])
        {
                vector u = new vector(5,4);
                vector v = new vector(3,-2);
                vector U = new vector(5,4,1);
                vector V = new vector(1,2,1);
                dotproduct(u.x,u.y,v.x,v.y);
                dotproduct(U.x,U.y,U.z,V.x,V.y,V.z);
                computeAngle(u,v);
                computeAngle(U,V);
        }
}
