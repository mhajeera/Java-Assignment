import java.util.Scanner;

public class SnackPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number of rows");
int m=s.nextInt();
System.out.println("enter the number of colums");
int n=s.nextInt();
int[][] a=new int[m][n];
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=s.nextInt();
	}
}
/*for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.println(a[i][j]+" ");
	}
}*/

for(int i=1;i<=m;i++)
{
	if((i%2)!=0)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.println(a[i][j]+"&");
		}
	}
	else
	{
		for(int k=n;k>=1;k--)
		{
			System.out.println(a[i][k]+",");
		}
	}
	
}




	}

}
