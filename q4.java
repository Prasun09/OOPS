package OOPS;
class Person{
	 String name;
	 int age;
	Person(){
	
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
}
	class Employee extends Person{
		 int Eid;
		double salary;
	
	Employee(String name,int age,int Eid,double salary){
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void display1() {
		System.out.println(name+" "+age+" "+Eid+" "+salary);
	}
	}

public class q4 {

	public static void main(String[] args) {
		Employee e=new Employee("Prasun",19,123,2000);
		
		e.display1();
		

	}

}
