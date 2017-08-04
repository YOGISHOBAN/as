import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int temp1=0;
		System.out.println("Enter the first number");
		int a=in.nextInt();
		System.out.println("Enter the second number");
		int b=in.nextInt();
		int temp=Math.min(a,b);
		for(int i=temp;i>=1;i--)
		{
			if(a%i==0&&b%i==0)
			{
				temp1=i;
				break;
			}
		}
		System.out.println("H.C.F "+temp1);

	}

}
