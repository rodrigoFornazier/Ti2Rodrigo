import java.util.Scanner;
class Soma {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num1,num2;
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		int soma = num1+num2;
		System.out.println(soma);
		ler.close();
	}
}
