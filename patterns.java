import java.util.Scanner;

class Patterns
{
	public static void main(String args[])
	{
		int n=4;
		int m=5;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// class Pattern
// {
// 	static void pat(int n)
// 	{
// 		for(int i=1; i<=m; i++)
// 		{
// 			for(int j=1; j<=i; j++)
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}

// 	public static void main(String args[])
// 	{
// 		int m = 5;

// 		pat(m);
// 	}
// }

class PyramidPattern
{
	public static void main(String args[])
	{
		int k = 5;
		for(int i=1; i<=k; i++)
		{
			for(int j=k; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int m=1; m<=(2*i-1); m++) 
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}

class Pyramid
{
	public static void main(String args[])
	{
		int k=5;
		for(int i=1; i<=k; i--)
		{
			for(int j=k; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
}

class oneZero
{
	public  static void main(String args[])
	{
		int m=5;
		for(int i=1; i<=m; i++)
		{
			for(int j=m; j>i; j--)
			{
				System.out.print("");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}

class HollowRectangle
{
	public static void main(String args[])
	{
		int n=4;
		int m=5;

		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				if(i == 1 || j == 1 || i == n || j == m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


class HalfPyramid
{
	public static void main(String args[])
	{
		int num=1;

		for(int i=4; i>=1; i--)
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print(num+"   ");
				num++;	
			}
			System.out.println();
		}
		// int num = 1;
		// for(int i=1; i<=4; i++)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print(num+ " ");
		// 		num++;
		// 	}
		// 	System.out.println();
		// }

		// for(int i=4; i>=1; i--)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1; i<=4; i++)
		// {
		// 	for(int j=1; j<=4-i; j++)
		// 	{
		// 		System.out.print(" ");
		// 	}
			
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1; i<=5; i++)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print(j+" ");
		// 	}
		// 	System.out.println();
		// }

		// int num = 1;
		// for(int i=1; i<=5; i++)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print(num+" ");
		// 		num++;
		// 	}
		// 	System.out.println();
		// }

		// for(int i=1; i<=5; i++)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		int sum = i+j;
		// 		if(sum%2==0)
		// 		{
		// 			System.out.print("1");
		// 		}
		// 		else
		// 		{
		// 			System.out.print("0");
		// 		}
		// 	}
		// 	System.out.println();
		// }

		// for(int i=5; i>=1; i--)
		// {
		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();	
		// }

		// int p=5;
		// for(int i=1; i<=p; i++)
		// {
		// 	for(int j=1; j<=p-i; j++)
		// 	{
		// 		System.out.print(" ");
		// 	}

		// 	for(int j=1; j<=i; j++)
		// 	{
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// for (int i=5; i>=1; i--) 
		// {
		// 	for (int j=1; j<=i; j++) 
		// 	{
		// 		System.out.print(j+" ");
		// 	}
		// 	System.out.println();
		// }
	}
}

class SolidRectangle
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 4;

		for(int i=1; i<=x; i++)
		{
			for(int j=1; j<=y; j++)
			{
				if(i == 1 || j == 1 || i == x || j == y)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
