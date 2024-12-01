import java.util.*;
class AlternatMarge
{private char ab[],bc[],cd[];

	AlternatMarge(char ab[],char bc[],char cd[])
	{
		this.cd=cd;
		this.ab=ab;
		this.bc=bc;
	}
	
	char[] methodMergeArray()
	{	int k=0;
		for(int i=0;i<ab.length;i++)
		{
			cd[k]=ab[i];
			k++;
			cd[k]=bc[i];
			k++;
		}
		
	return cd;
	}
	
}
public class AlternatMargeApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("enter the size of array");
		int size=xyz.nextInt();
		char ab[]= new char[size];
		System.out.println("enter the charachers in first array");
		
		for(int i=0;i<ab.length;i++)
		{
			ab[i]=xyz.next().charAt(0);
		}
		
		char bc[]= new char[size];
		int size3=size+size;
		System.out.println("enter the charachers in Second array");
		for(int i=0;i<bc.length;i++)
		{
			bc[i]=xyz.next().charAt(0);
		}
		char cd[]=new char[size3];
		AlternatMarge A=new AlternatMarge(ab,bc,cd);
		char result[]=A.methodMergeArray();
		for(int i=0;i<cd.length-1;i++)
		{
			System.out.print(cd[i]+" ");
		}
	}
}