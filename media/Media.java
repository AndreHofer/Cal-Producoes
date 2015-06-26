import java.util.Scanner;

class Media{
	public void Media(){
		double n1,n2,n3,n4,n5,media;
		
		Scanner input= new Scanner( System.in );

		System.out.println("Num1=");
		n1 = input.nextInt();
		System.out.println("Num2=");
		n2 = input.nextInt();
		System.out.println("Num3=");
		n3 = input.nextInt();
		System.out.println("Num4=");
		n4 = input.nextInt();
		System.out.println("Num5=");
		n5 = input.nextInt();
		
		
		media = (n1+n2+n3+n4+n5)/5;

		System.out.println("Media = " + media);
	}
}
