import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a=new Scanner(System.in);
		int c=0;
		System.out.println("Enter the array length");
		int len= a.nextInt();  //Determining length of array
		int b[]=new int[len];
		for(int i=0; i<len; i++)
		{
			b[i]=a.nextInt();
			
		}
		
		int m=len-1;
		int n=len-2;
		int d=b[m]-b[n];
for(int k=len; k>0; k--)
{
int	i=len-1;int j=i-1;

	if((b[i]-b[j])!=d)
	{
		c=8;
		break;			
	}	
	
	i--;j--;
	c++;
}

		if(c==len)
		{
		
			System.out.println("Same Frequency");
		}
		else
		{
			System.out.println("Not Same Frequency");
		}
			}
		

	}

