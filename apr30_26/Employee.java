package apr30_26;

public class Employee {
	int id;
	String name;
	
//	Employee(int id,String name){
//		this.id=id;
//		this.name=name;
//	}
	
	void dispalyInfo() {
		System.out.println(this.id + " " + this.name);
	}
	
}




public class Developer extends Employee {
	String role;
	
	Developer(int id,String name,String role){
		this.id=id;
		this.name=name;
		this.role=role;
	}
	void displayInfo() {
		System.out.println(this.id + " " + this.name + " " + this.role);
	}
}



public class Manager extends Employee {
	double salary;
	Manager(int id,String name,double salary){
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	void dispalyInfo() {
		System.out.println(this.id + " " + this.name + " " + this.salary);
	}
}



public class Test {
	public static void main(String[] args) {
		Developer d = new Developer(20,"surya","Sql Developer");
		d.displayInfo();
		Manager m = new Manager(25,"Sai",25000);
		m.dispalyInfo();
	}
}