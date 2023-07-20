class  Primenum
{
	public static void main(String[] args) 
	{
		           int num =13;
                   int den;
		 
		          for(den=2; den<num; den ++)
	            	{ 
			             if(num%den==0)
			                {
			                    	break;
			                }
		            }
                  if(num==den)
		           {
	                    System.out.println("It is Prime Number");
		            }
		         else
		           {
                        System.out.println("It is Prime Not Number");
		           }

	}
}
