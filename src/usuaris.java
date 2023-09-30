import java.util.Scanner;

public class usuaris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		String usuari1 = "pepe2";
		String usuari2 = "manolito4";
		String usuari3 = "maria8";
		String contrasenya1 = "1357";
		String contrasenya2 = "2468";
		String contrasenya3 = "0987";
		String usuariEntrat = "";
		String contrasenyaEntrada = "";
		
		System.out.println("Introdueix el teu nom d'usuari: ");
		usuariEntrat = lector.nextLine();

		
		if (usuariEntrat.equals(usuari1)) {
			System.out.println("Introdueix la contrasenya de l'usuari pepe2: ");
			contrasenyaEntrada = lector.nextLine();
			if (contrasenyaEntrada.equals(contrasenya1)) {
				System.out.println("Contrasenya correcte accès autoritzat.");
			}
			else {
				System.out.println("Contrasenya incorrecte!");
				}
		}
		else if (usuariEntrat.equals(usuari2)) {
			System.out.println("Introdueix la contrasenya de l'usuari manolito4: ");
			contrasenyaEntrada = lector.nextLine();
			if (contrasenyaEntrada.equals(contrasenya2)) {
					System.out.println("Contrasenya correcte accès autoritzat.");
				}
			else {
					System.out.println("Contrasenya incorrecte!");
				}
		}
		else if (usuariEntrat.equals(usuari3)) {
			System.out.println("Introdueix la contrasenya de l'usuari maria8: ");
			contrasenyaEntrada = lector.nextLine();
			if (contrasenyaEntrada.equals(contrasenya3)) {
					System.out.println("Contrasenya correcte accès autoritzat.");
				}
			else {
					System.out.println("Contrasenya incorrecte!");
				}
		}
		else {
			System.out.println("Nom d'usuari incorrecte!!");
		}
	}

}
