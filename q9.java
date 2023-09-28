package OOPS;
import java.util.Scanner;

class Student121
{
	int roll_no;
	String name;
	String course;
	
	void input_st(int roll_no,String name,String course)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.course=course;
	}
	void dispaly()
	{
		System.out.println(roll_no+" "+name+" "+course);
	}
}
 class Exam extends Student121
 {
	 int m1;
	 int m2;
	 int m3;
	 void input_mrks(int m1,int m2,int m3)
	 {
		 this.m1=m1;
		 this.m2=m2;
		 this.m3=m3;
	 }
	 void display_m()
	 {
		 System.out.println(m1+" "+m2+" "+m3);
	 }
		 
 }
 
public class q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exam[]e=new Exam[5];
		for(int i=0;i<5;i++)
		{
			
			e[i]=new Exam();
			System.out.println("Enter the details ");
			int a=sc.nextInt();	
			String b=sc.next();
			String c=sc.next();
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();
			
			e[i].input_st(a,b,c);
			e[i].input_mrks(p,q,r);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Dispaly the detials: ");
		
		}
	}

}
