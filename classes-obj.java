// class Car
// {
// 	String color;
// 	String name;
// 	String company;

// 	public void write()
// 	{
// 		System.out.println("Car is mine!");
// 	}

// 	public void showData()
// 	{
// 		System.out.println("Car Color: " +this.color);
// 		System.out.println("Car Name: " +this.name);
// 		System.out.println("Car Company: " +this.company);
// 	}

// 	// Car(String color, String name, String company)
// 	// {
// 	// 	this.color = color;
// 	// 	this.name = name;
// 	// 	this.company = company;
// 	// }

// 	public static void main(String[] args) 
// 	{
// 		Car car1 = new Car();
// 		car1.color = "Grey";
// 		car1.name = "Altroz";
// 		car1.company = "Tata";

// 		// Car car2 = new Car();
// 		// car2.color = "Black";
// 		// car2.name = "Hector";
// 		// car2.company = "MG";

// 		// car1.showData();
// 		// car2.showData();
// 		// car1.write();

// 		// Car car1 = new Car("Altroz","Black","Tata");
// 		car1.showData();

// 	}

// }


// class Student
// {
// 	int id;
// 	String name;

// 	public void showData()
// 	{
// 		System.out.println(this.id);
// 		System.out.println(this.name);
// 	}

// 	public static void main(String args[])
// 	{
// 		Student stu = new Student();
// 		stu.id = 01;
// 		stu.name = "Harshil";

// 		stu.showData();
// 	}
// }


// class Dog
// {
// 	String name;
// 	String breed;
// 	int age;
// 	String color;

// 	public Dog(String name, String breed, int age, String color)
// 	{
// 		this.name = name;
// 		this.breed = breed;
// 		this.age = age;
// 		this.color = color;
// 	}

// 	public void showData()
// 	{
// 		System.out.println("Name: "+this.name);
// 		System.out.println("Breed: "+this.breed);
// 		System.out.println("Age: "+this.age);
// 		System.out.println("Color: "+this.color);

// 	}

// 	public static void main(String args[])
// 	{
// 		Dog d1 = new Dog("Goofy","Beagle",5,"Brown");
// 		d1.showData();
// 	}
// }


class College
{
	int id;
	String name;
	String course;
	String year;

	public College(int id, String name, String course, String year)
	{
		this.id = id;
		this.name = name;
		this.course = course;
		this.year = year;
	}

	public void showData()
	{
		System.out.println("Student ID: " +this.id);
		System.out.println("Student Name: " +this.name);				
		System.out.println("Student Course: " +this.course);
		System.out.println("Student Year: " +this.year);
	}

	public static void main(String args[])
	{
		College clg = new College(1, "Harshil", "MScIT", "Third");
		clg.showData();
	}
}