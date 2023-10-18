import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		double pi;
		double radio;
		pi = 3.1416;
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escriba el nombre");
		 radio = sc.nextDouble();
		 
		 double resultado = 2*pi*radio;
		 
		 System.out.println("El resultado es:"+resultado);
	}

}
