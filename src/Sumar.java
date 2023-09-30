import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		double primerNombre = 2;
		double segonNombre = 4;
		double tercerNombre = 1;
		double resultat = 0;
		
		System.out.println("Introdueix el primer nombre:");
		primerNombre = lector.nextInt();
		System.out.println("Introdueix el segon nombre:");
		segonNombre = lector.nextInt();
		System.out.println("Introdueix el tercer nombre:");
		tercerNombre = lector.nextInt();
		resultat = primerNombre + segonNombre + tercerNombre;

		System.out.println("El resultat de la suma dels tres nombres es: ");
		System.out.println(resultat);
	}

}
