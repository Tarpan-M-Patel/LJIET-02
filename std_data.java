package TNS;
import java.util.Scanner;
public class std_data 
	{
		int rollno;
		int marks;
		String std_name;
		 Scanner sc=new Scanner(System.in);
		public void setdetails()
		{
			System.out.println("Enter Name:");
			std_name=sc.next();
			System.out.println("Enter roll number:");
			rollno=sc.nextInt();
			System.out.println("Enter marks:");
			marks=sc.nextInt();
		}
		public void show()
		{
			System.out.println("Student Name:"+std_name+", Roll number:"+rollno+", marks:"+marks);
		}
		public static void main(String []args)
		{
			std_data std[]=new std_data[5];
			int a=0;
			do{
				std[a]= new std_data();
				std[a].setdetails();
				a++;
			}while(a<5);
	        System.out.println("count="+a);
			a=0;
			do{
				std[a].show();
				a++;
			}while(a<5);
		}
	}

