import java.io.*;
import java.util.Scanner;
class CommentTest
{	
	public static void main(String... s) throws IOException
	{	
		int flag=-1,temp=0,start=0,end=0,flag1=-1,temp1=0;
		String theString="";
		FileInputStream fin =new FileInputStream(new File("F://programming//javaprac//IO//lalu1.txt"));
		Scanner scanner=new Scanner(fin);
		theString = scanner.nextLine();
		while (scanner.hasNextLine()) 
		{
				theString = theString + "\n" + scanner.nextLine();
			}

		char[] charArray = theString.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			if(charArray[i]=='/')
			{
				flag=1;
				temp=i;
				
				if(flag==1)
				{	flag=0;
					if(charArray[i+1]=='*')
					{
						start=i+1;
							
						}
				}
			}
			if(charArray[i]=='*')
			{
				flag1=1;
				temp1=i;
				
				if(flag1==1)
				{		flag1=0;
						if(charArray[i+1]=='/')
						{
							end=i;
							}
				}
			}
		}
		for(int k=start+1;k<end;k++)
		{
			System.out.print(charArray[k]);
			}
			
	}
	
}