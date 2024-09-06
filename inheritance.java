import java.util.*;

// 1. Single-Level Inheritance
// class Data
// {
//     public void Name()
//     {
//         System.out.println("Harshil Rasania");
//     }
// }

// class College extends Data
// {
//     public void Uni()
//     {
//         System.out.println("GLS University");
//     }
// }

// class OOPS
// {
//     public static void main(String args[])
//     {
//         College c1 = new College();  // Correct instance to access both methods
//         c1.Name();  // Method from the Data class
//         c1.Uni();   // Method from the College class
//     }
// }


//2. Multi-Level Inheritance
// class Car
// {
// 	public void name()
// 	{
// 		System.out.println("Altroz");
// 	}
// }


// class CarColor extends Car
// {
// 	public void color()
// 	{
// 		System.out.println("Grey");
// 	}
// }


// class CarCompany extends CarColor
// {
// 	public void company()
// 	{
// 		System.out.println("Tata");
// 	}
// }

// class OOPS2
// {
// 	public static void main(String args[])
// 	{
// 		CarCompany c1 = new CarCompany();
// 		c1.name();
// 		c1.color();
// 		c1.company();
// 	}
// }


//3. Hierarchial Inheritance
class Animal
{
	public void animal()
	{
		System.out.println("Animal");
	}
}

class HarmfullAnimal extends Animal
{
	public void harmfullAnimal()
	{
		System.out.println("Harmfull Animal");
	}
}

class Name extends HarmfullAnimal
{
	public void name()
	{
		System.out.println("Sher");
		System.out.println("Chittah");
		System.out.println("Sanp");
	}
}

class HarmlessAnimal extends Animal
{
	public void harmlessAnimal()
	{
		System.out.println("Harmless Animal");
	}
}

class Name1 extends HarmlessAnimal
{
	public void name1()
	{
		System.out.println("kutta");
		System.out.println("billi");
		System.out.println("chuha");
	}
}

class OOPS3
{
	public static void main(String args[])
	{
		HarmfullAnimal full = new HarmfullAnimal();
		full.animal();
		full.harmfullAnimal();

		HarmlessAnimal less = new HarmlessAnimal();
		less.animal();
		less.harmlessAnimal();

		Name n1 = new Name();
		n1.animal();
		n1.harmfullAnimal();
		n1.name();j

		Name1 n2 = new Name1();
		n2.animal();
		n2.harmlessAnimal();
		n2.name1();
	}
}

