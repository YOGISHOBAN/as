import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
		String s=" ";
		int m=0,n=0,p=0,q=0,l=0;
		StringBuffer c=new StringBuffer();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				s=a.substring(i,j);
				c=new StringBuffer(s);
				String d=c.reverse().toString();
				 l=s.length();
				if(l>m&&s.equals(d))
				{
					p=i;
					q=j;
					m=l;
					
				}
				
			}
		}
		System.out.println(a.substring(p,q));
	}

}
