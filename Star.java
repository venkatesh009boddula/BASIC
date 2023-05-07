class Star
{
	public static void main (String args [])
	{
		
		int n = 5;
		
		for (int i=1; i<=n; i++)// rows
		{
			
		 for (int j=1; j<=n; j++)// column
			 
		 {
		System.out.print("* ");
		
		 }
		 System.out.println ();
		}
		
		//increasing triangle
		
		for (int i=1; i<=n; i++)// rows
		{
			
		 for (int j=1; j<=i; j++)// column
			 
		 {
		System.out.print("* ");
		
		 }
		 System.out.println ();
		}
		
		// decresing triange
		for (int i=1; i<=n; i++)// rows
		{
			
		 for (int j=i; j<=n; j++)// column
			 
		 {
		System.out.print("* ");
		
		 }
		 System.out.println ();
		}
		
		// right sided triangle
		
		for (int i=1; i<=n; i++)// rows
		{
			{
				for (int j=i; j<=n; j++)
				{
					System.out.print (" ");
				}
			
		        for (int k=1; k<=i; k++)// column
			 
		   {
		        System.out.print("* ");
		   }
		        System.out.println ();
		}
			
	}

}
}
