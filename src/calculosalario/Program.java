package calculosalario;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double value, salary;
		
		System.out.print("Qual o n�mero do funcion�rio: ");
		number = sc.nextInt();
		
		System.out.print("Digite o n�mero de horas trabalhadas: ");
		hours = sc.nextInt();
		
		System.out.print("Digite o valor recebido por hora trabalhada: ");
		value = sc.nextDouble();
		
		salary = hours * value;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();

	}

}
