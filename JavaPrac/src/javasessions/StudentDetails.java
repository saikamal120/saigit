
public class StudentDetails {

	int id;
	String name;
	int age;
	StudentDetails(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	StudentDetails(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails(2021, "ram");
		StudentDetails s2 = new StudentDetails(2022, "sai", 22);
		s1.display();
		s2.display();
	}
}
