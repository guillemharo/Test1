import java.util.Scanner;

public class piscines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		String lletra;
		char tipusPiscina;
		double pi = 3.1416;
		double radi;
		double fondaria;
		double llargada;
		double amplada;
		double baseTriangle;
		double alturaTriangle;
		double aiguaTotal;
		int preuMetreCubic = 25;
		double preuTotal;
		
		System.out.println("Determina la forma de la teva piscina (c=Circular, r=Rectangular, t=Triangular): ");
		lletra = lector.nextLine();
		tipusPiscina = lletra.charAt(0);
		
		if (tipusPiscina == 'c') {
			System.out.println("Introdueix les mides de la piscina (radi i fondaria): ");
			radi = lector.nextDouble();
			fondaria = lector.nextDouble();
			lector.nextLine();
			aiguaTotal= pi * (radi * radi) * fondaria;
			preuTotal = aiguaTotal * preuMetreCubic;
			System.out.println("Els metres cubics necessaris per omplir la piscina seràn: " + aiguaTotal);
			System.out.println("El cost d'omplir la piscina serà de " + preuTotal + "€");
		}
		else if (tipusPiscina == 'r') {
			System.out.println("Introdueix les mides de la piscina (llargada,  amplada i fondaria): ");
			llargada = lector.nextDouble();
			amplada = lector.nextDouble();
			fondaria = lector.nextDouble();
			lector.nextLine();
			aiguaTotal = llargada * amplada * fondaria;
			preuTotal = aiguaTotal * preuMetreCubic;
			System.out.println("Els metres cubics necessaris per omplir la piscina seràn: " + aiguaTotal);
			System.out.println("El cost d'omplir la piscina serà de " + preuTotal + "€");
		}
		else if (tipusPiscina == 't') {
			System.out.println("Introdueix les mides de la piscina (Base i alçada del triangle, i fondaria): ");
			baseTriangle = lector.nextDouble();
			alturaTriangle = lector.nextDouble();
			fondaria = lector.nextDouble();
			lector.nextLine();
			aiguaTotal = (baseTriangle * alturaTriangle) /2 * fondaria;
			preuTotal = aiguaTotal * preuMetreCubic;
			System.out.println("Els metres cubics necessaris per omplir la piscina seràn: " + aiguaTotal);
			System.out.println("El cost d'omplir la piscina serà de " + preuTotal + "€");
		}
	}

}
