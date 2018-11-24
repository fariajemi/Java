import java.util.Scanner;

public class Add_Two_Num {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first num: ");
		int n1=input.nextInt();
		System.out.print("Enter second num: ");
		int n2=input.nextInt();
		int sum=n1+n2;
		System.out.println(sum);
		int div=n1-n2;
		System.out.println(div);
		int multi=n1*n2;
		System.out.println(multi);
	}

}
