import java.util.Scanner;

public class Sequencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		String nif;
		String nom;
		String data = "27/09/2023";
		int unitatsA;
		int unitatsB;
		int unitatsC;
		double preuA = 25.4;
		double preuB = 12.0;
		double preuC = 33.3;
		
		System.out.println("Introdueix el nif i nom del client:");
		nif = lector.next();
		nom = lector.next();
		lector.nextLine();
		System.out.println("Introdueix el nombre de productes de cada categoria (A, B, C): ");
		unitatsA = lector.nextInt();
		unitatsB = lector.nextInt();
		unitatsC = lector.nextInt();
		lector.nextLine();
		
		System.out.println("FACTURA");
		System.out.println(" ");
		System.out.println("NIF: " + nif + "   Nom Client: " + nom + "   Data: " + data);
		System.out.println("Producte A.  Unitats: " + unitatsA + "   Preu per unitat: " + preuA + "   Preu total: " + unitatsA * preuA);
		System.out.println("Producte B.  Unitats: " + unitatsB + "   Preu per unitat: " + preuB + "   Preu total: " + unitatsB * preuB);
		System.out.println("Producte C.  Unitats: " + unitatsC + "   Preu per unitat: " + preuC + "   Preu total: " + unitatsC * preuC);
		System.out.println("Total + IVA (18%): " + (unitatsA + preuA * unitatsB + preuB * unitatsC + preuC) * 1.18);
	}

}
