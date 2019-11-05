import java.util.ln
	class SalesmanFix
	{public static void main(String args[])
			{
				int i,j;
				int s[][]=new int [5][4];
				int salesman_hs=s[0][3];
				int salesman_ind=0;
				int prod_ind=0;
				int sum=1
				Scanner sc- new Scanner(System.in);
				for(i=0;i<=4;i++)
				{
					System.out.printIn("Enter product sold by salesman"+(i+1));
					for(j=0;j<=2;j++)
					{

						System.out.printIn("Enter sale for product"+(j+1));
						s[i][k]=sc.nextInt();
						s[i][3]=s[i][3]+s[i][j];
					}	
					for(j=1;j<=4;j++)
					{
						salesman_hs=s[i][3];
						salesman_ind=i;

					}
					if(max_prod=sum)
					{
						max_prod=sum;
						prod_ind=j;

					}
				}
				System.out.println("p1\t ps\t p3\t total");
				for(i=0;i<=4;i++)
				{

					for(j=0;j<=3;j++)
				{
					System.out.print(s(i)(j)+"\t");
				}
				System.out.println(;)
			}
			System.out.println("\n Salesman"+(salesman_ind+1)+"has the hightest sales of"+salesman_hs);
			System.out.println("Product"+(prod_ind+1)+"has the highest sales of"+max_prod);
		
	}