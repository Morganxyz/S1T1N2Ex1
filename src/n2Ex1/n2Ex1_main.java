package n2Ex1;

import java.util.Scanner;

public class n2Ex1_main {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		
		Smartphone smart0 = new Smartphone("Marca1","Model1");
				
		System.out.println("Indica el número de telèfon a marcar: ");
		num = entrada.nextInt();
		
		System.out.println(smart0.trucar(num));
		System.out.println(smart0.fotografiar());
		System.out.println(smart0.alarma());
	}

}
