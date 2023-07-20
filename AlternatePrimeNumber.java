import java.util.Scanner;
class AlternatePrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Starting Range:");
		int num = sc.nextInt();
		System.out.println("enter the ending Range:");
		int end = sc.nextInt();
        int count=0;
		for(int i =num; i<=end ; i++)
		{
			int den;
			for(den=2 ; den<i ; den++)
			{
				if(i%den==0)
				{
					break;
				}
			}
			if(i==den)   //2==2
			{
                count++;  //1
				if(count%2==1)  //1%2==1
			{
				System.out.println(i);  //2,
			}
		}
	}
  }
}