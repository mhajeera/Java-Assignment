import java.util.Scanner;

public class LuckyNumber {

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
for(int m=0; m<len; m++)
{
	for(int n=m+1; n<len; n++)
	{
		if(b[m]==b[n])
		{
			c=8;
			break;			
		}	
    }
	c++;
	}

if(c==len)
{
	System.out.println("LUCKY NUMBER");
}
else
{
System.out.println("UNLUCKY NUMBER");
}
	}
}
