import java.util.Scanner;

public class Preguntes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int edat;
		int alcada;
		int pes;
		String nom;
		String primerCognom;
		String segonCognom;
		String frase;
		
		System.out.println("Introdueix la teva edat, alçada i pes:");
		edat = lector.nextInt();
		alcada = lector.nextInt();
		pes = lector.nextInt();
		lector.nextLine();
		System.out.println("Introdueix el teu nom i els dos cognoms:");
		nom = lector.next();
		primerCognom = lector.next();
		segonCognom = lector.next();
		lector.nextLine();
		frase = "Hola " + nom + " " + primerCognom + " " + segonCognom + ", tens " + edat + " anys, medeixes "  + alcada + " centímetres i peses " + pes + " kilos.";
		System.out.println(frase);
	}

}
