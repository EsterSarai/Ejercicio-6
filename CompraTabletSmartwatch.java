import java.util.Scanner;

public class JavaApplication4 {
	public static void main(String[] args) {
		Scanner pc= new Scanner(System.in);
		String user;
		int precio=0;

		System.out.println("Indica tipo de aparato: Tablet(50$) o Smartwatch(25$)");
		user= pc.nextLine();

		if (user.equals("Tablet")) {
			System.out.println("Ha escogido ordenador de Tablet");
			precio+=500;
		}

		if (user.equals("Smartwatch")){
			System.out.println("Ha escogido Smartwatch");
			precio+=600;
		}

		System.out.println("El precio final es "+precio+" DOLARES");
		pc.close();
	}
}