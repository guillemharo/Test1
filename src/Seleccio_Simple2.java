import java.util.Scanner;

public class Seleccio_Simple2 {

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
		double total = 0;
		
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
		
		if (unitatsA > 0) {
			total = total + unitatsA * preuA;
			System.out.println("Producte A.  Unitats: " + unitatsA + "   Preu per unitat: " + preuA + "   Preu total: " + total);
		}
		if (unitatsB > 0) {
			total = total + unitatsB * preuB;
			System.out.println("Producte B.  Unitats: " + unitatsB + "   Preu per unitat: " + preuB + "   Preu total: " + total);
		}
		if (unitatsC > 0) {
			total = total + unitatsC * preuC;
			System.out.println("Producte C.  Unitats: " + unitatsC + "   Preu per unitat: " + preuC + "   Preu total: " + total);
		}
		if (total > 100) {
			total = total * 0.95;
			System.out.println("Preu Total - Descompte (5%): " + total);
			System.out.println("Preu Total - Descompte (5%) + IVA (18%): " + total * 1.18);
		}
		else {
			System.out.println("Total + IVA (18%): " + total * 1.18);
		}
	}

}