import java.util.Scanner;

public class Dia_Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		String dia;

		System.out.println("Introdueix un dia de la semana: ");
		dia = lector.nextLine();
		
		if (dia.equals("Dilluns")) {
			System.out.println("El Dilluns es el primer dia de la semana i es lectiu.");
		}
		else if (dia.equals("Dimarts")) {
			System.out.println("El Dimarts es el segon dia de la semana i es lectiu.");
		}
		else if (dia.equals("Dimecres")) {
			System.out.println("El Dimecres es el tercer dia de la semana i es lectiu.");
		}
		else if (dia.equals("Dijous")) {
			System.out.println("El Dijous es el quart dia de la semana i es lectiu.");
		}
		else if (dia.equals("Divendres")) {
			System.out.println("El Divendres es el cinquè dia de la semana i es lectiu.");
		}
		else if (dia.equals("Dissabte")) {
			System.out.println("El Dissabte es el sisè dia de la semana i no es lectiu.");
		}
		else if (dia.equals("Diumenge")) {
			System.out.println("El Diumenge es el setè dia de la semana i no es lectiu.");
		}
		else {
			System.out.println("Error!! El text que has introduit no concorda amb cap dia de la semana");
		}
	}

}
