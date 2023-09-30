import java.util.Scanner;

public class Seleccio_Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		double preu;
		
		System.out.println("Introdueix el preu:");
		preu = lector.nextInt();
		lector.nextLine();
		
		if (preu > 100) {
			preu = preu * 0.9;
			System.out.println("El preu final amb el descompte del 10% es de: " + preu);
		}
		else {
			System.out.println("El preu final es de: " + preu);
		}
	}

}
