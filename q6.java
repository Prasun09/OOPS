package OOPS;
import java.util.Scanner;
class Student
{
	int roll;
	String name;
	double Dsa_mark;
	Student(){
		
	}
	Student(int roll,String name,double Dsa_mark)
	{
		this.roll=roll;
		this.name=name;
		this.Dsa_mark=Dsa_mark;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+Dsa_mark);
	}
	Student topper(Student[]ar)
	{
		Student temp=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(temp.Dsa_mark<ar[i].Dsa_mark) 
			{
				temp=ar[i];
			}
		}
	return temp;
	}
}



public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		Student []ar=new Student[n];
		for(int i=0;i<ar.length;i++)
		{
			int a=sc.nextInt();
			String b=sc.next();
			double c=sc.nextDouble();
			ar[i]=new Student(a,b,c);
		}
		for(int i=0;i<ar.length;i++)
		{
			ar[i].display();
		}
	System.out.println("Details of the student who gets higher marks ");
	
	Student res=new Student();
	res=ar[0].topper(ar);
	res.display();
	}
}
