import java.util.*;
class ForLoop
{
	public static void main(String args[])
	{
		// for(int i=0; i<3; i=i+1)
		// {
		// 	System.out.println("Hello World!");
		// }

		// for(int i=0; i<11; i++)
		// {
		// 	System.out.println(i);
		// }

		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// int sum=0;
		// for(int i=0; i<=n; i++)
		// {
		// 	sum = sum+i;
		// }
		// System.out.println(sum);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<11; i++)
		{
			System.out.println(i*n);
		}
	}
}

class WhileLoop
{
	public static void main(String args[])
	{
		int i=0;
		while(i<11)
		{
			System.out.println(i);
			i = i+1;	
		}
	}
}

class DoWhileLoop
{
	public static void main(String args[])
	{
		int i=0;
		do
		{
			System.out.println(i);
			i=i+1;
		}
		while(i<11);
	}
}

class numLoop
{
	public static void main(String args[])
	{
		int num=1;
		for(int i=1; i<=20; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}

class PrimeNumber
{
	static void Prime(int N)
	{
		int flg;
		System.out.println("All the Prime numbers within 1 and " + N
            + " are:");
		for(int i=1; i<=N; i++)
		{
			if(i == 1 || i == 0)
				continue;
			flg=1;

			for(int j=2; j <= i/2; ++j)
			{
				if(i%j == 0)
				{
					flg=0;
					break;
				}
			}

			if(flg == 1)
			{
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Prime(N);
	}
}

class Factorial
{
	static int fact(int n)
	{
		int rev = 1;
		for(int i=2; i<=n; i++)
		{
			rev *= i;
			
		}
		return rev;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		System.out.println("Factorial of "+num+" is "+fact(num));
	}
}