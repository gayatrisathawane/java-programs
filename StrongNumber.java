import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc .nextInt();
		int sum=0;
		while(num>0)
		{
			int rem = num%10;
			int fact =1;
				for(int i =1;i<=rem ; i++)
			     {     
				fact=fact*i;

			     }
				 sum=sum+fact;
				 num/=10;
		}
		if(sum==num)
		{
			System.out.println("it is strong number");
		}
		else
		{
            System.out.println("it is  not strong number");
		}
	}
}
