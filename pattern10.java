import java.util.*;
class Pattern8
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
for(int i=n;i>=1;i--)
{
	for(int j=n-1;j>=i;j--)
	{
		System.out.print(" ");
		}
	for(int k=i;k>=1;k--){
	System.out.print("*");
	}
System.out.println();
}
}
}