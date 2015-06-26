import java.util.Scanner;
class Main{
	
	public static void main(String args[]) {
		Primos p=new Primos();
		Scanner scanner = new Scanner(System.in);
		p.calculaPrimos(scanner.nextInt(), scanner.nextInt());
	}
}
