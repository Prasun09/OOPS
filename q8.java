package OOPS;
 interface Detailinfo{
	 void display();
	 int count();
 }
 class Person3 implements Detailinfo{
	  private String name;
	private static int maxcount=0;
	 
	Person3(String name)
	 {
		 this.name=name;
	 }
 
	public void display()
	 {
		 System.out.println("Name: "+name);
	 }
 
 	public int count()
	{
		int charcount=name.length();
		if(charcount > maxcount)
		{
			maxcount=charcount;
		}
			return charcount;
	
 }

	

	public static void main(String[] args) {
		Person3 p1=new Person3("PRASUN");
		Person3 p2=new Person3("OM");
		p1.display();
		System.out.println("Charcount: "+p1.count());
		System.out.println("Charcount: "+p2.count());
		System.out.println("Maxcount: "+maxcount);
	}

 }
 
/*interface DetailInfo {
    void display();
    int count();
}

class Person implements DetailInfo {
    private String name;
    private static int maxcount = 0;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        int charCount = name.length();
        if (charCount > maxcount) {
            maxcount = charCount;
        }
        return charCount;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe");
        Person person2 = new Person("Jane Smith");

        person1.display();
        System.out.println("Character count: " + person1.count());

        person2.display();
        System.out.println("Character count: " + person2.count());

        System.out.println("Max character count: " + maxcount);
    }
}*/
