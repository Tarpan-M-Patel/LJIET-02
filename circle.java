import java.util.Scanner;

public class Circle 
    {
        float r,area ,circumference;
        final float PI = (float) Math.PI;
        Scanner sc = new Scanner(System.in);
        
        public void setData()
        {
            System.out.println("Enter Radius:");
            r = sc.nextFloat();
            circumference = 2*PI*r;
            area = PI*r*r;
        }
        public void getData(){
            System.out.println("Radius of Circle: "+ r);
            System.out.println("Area of Circle: "+ area);
            System.out.println("Circumference of Circle: "+ circumference);
        }

        public static void main(String[] args) 
        {
            Circle c1 = new Circle();
            c1.setData();
            c1.getData();
        }
}