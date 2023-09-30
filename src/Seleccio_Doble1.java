import java.util.Scanner;

public class Seleccio_Doble1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int num1 = 2;
		int num2 = 5;
		int resultat;
		
		System.out.println("Introdueix un nombre:");
		resultat = lector.nextInt();
		lector.nextLine();
		
		if ((resultat == num1) || (resultat == num2)) {
			System.out.println("Enhorabona has encertat el numero!!");
		}
		else {
			System.out.println("El nombre que has introduit no es un dels secrets");
		}
	}

}
