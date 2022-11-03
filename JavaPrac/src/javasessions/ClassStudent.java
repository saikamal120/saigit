
public class ClassStudent {
	
	int id;
	String name;
	String department;
	
	ClassStudent(int id, String name, String department)
	{
	this.id = id;
	this.name = name;
	this.department = department;
	
	
	}

	
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassStudent cls = new ClassStudent(100, "james", "SSC");
		
		cls.display();
		
		ClassStudent cls2 = new ClassStudent(101, "akbar", "SSC");
		
		cls2.display();
		
		ClassStudent cls3 = new ClassStudent(102, "ram", "SSC");
		
	}

}
