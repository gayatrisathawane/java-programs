import java.util.Scanner;
class AlternateAndCount 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the starting position: ");
		int start= sc.nextInt();

		System.out.println("How many count you want ? ");      //alternate and 10 position
		int count= sc.nextInt();

		int count1=0;
		int count2=0;

		for (int i=start; count1<count; i++ )
		{
			int den;
			for (den=2 ;  i< den ; den++ )
			{
				if(i%den==0)
				{
					break;
				}
			}
			if (i==den)
			{
				System.out.println(i);
				count1++;
				if(count1%2==1)
				{
					count2++;
					System.out.println(i);
				}
			}
		}

          
	}
}
