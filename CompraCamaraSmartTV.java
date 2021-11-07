import java.util.Scanner;

public class JavaApplication4 {
	public static void main(String[] args) {
		Scanner pc= new Scanner(System.in);
		String user;
		int precio=0;

		System.out.println("Indica tipo de aparato: Camara(25$) o SmartTV(350$)");
		user= pc.nextLine();

		if (user.equals("Camara")) {
			System.out.println("Ha escogido ordenador de Camara");
			precio+=500;
		}

		if (user.equals("SmartTV")){
			System.out.println("Ha escogido SmartTV");
			precio+=600;
		}

		System.out.println("El precio final es "+precio+" DOLARES");
		pc.close();
	}
}