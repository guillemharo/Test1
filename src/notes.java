import java.util.Scanner;

public class notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int nota;
		
		System.out.println("Introdueix la teva nota: ");
		nota = lector.nextInt();
		lector.nextLine();
		
		if (nota <= 4) {
			System.out.println("Has tret la nota " + nota + " que correspon a un Suspès");
		}
		else if (nota <= 6) {
			System.out.println("Has tret la nota "+ nota + " que correspon a un Aprovat");
		}
		else if (nota <= 8) {
			System.out.println("Has tret la nota " + nota + " que correspon a un Notable");
		}
		else if (nota <= 10) {
			System.out.println("Has tret la nota " + nota + "que correspon a un Excelent");
		}
		else {
			System.out.println("El numero entrat no està entre el 0 i el 10");
		}
	}

}
