package TNS;
import java.util.Scanner;
public class emp 
	{
	
	    String emp_name;
	    String emp_dept;
	    int emp_id;
	    private static int count=0;
	    Scanner sc=new Scanner(System.in);

	    public void setdetails()
	    {
	        System.out.println("Enter employee name:");
	        emp_name=sc.next();
	        System.out.println("Enter employee id:");
	        emp_id=sc.nextInt();
	        System.out.println("Enter employee department:");
	        emp_dept=sc.next();
	        count++;
	    }

	    public void show()
	    {
	        System.out.println("Employee id:"+emp_id+", employee name:"+emp_name+", employee department:"+emp_dept+"    ");
	    }

	    public static void main(String[]args){
	        int i;
	        emp a[]=new emp[5];
	        for(i=0;i<a.length;i++){
	            a[i]=new emp();
	            a[i].setdetails();
	        }
	        System.out.println("Printing array of employees.");
	        for(i=0;i<a.length;i++){
	            a[i].show();
	        }
	        System.out.println("Number of employees "+emp.count);
	    }
	}

