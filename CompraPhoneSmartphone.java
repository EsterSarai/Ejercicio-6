import java.util.Scanner;

public class JavaApplication4 {
	public static void main(String[] args) {
		Scanner pc= new Scanner(System.in);
		String user;
		int precio=0;

		System.out.println("Indica tipo de aparato: Phone(50$) o Smartphone(250$)");
		user= pc.nextLine();

		if (user.equals("Phone")) {
			System.out.println("Ha escogido ordenador de Phone");
			precio+=500;
		}

		if (user.equals("Smartphone")){
			System.out.println("Ha escogido Smartphone");
			precio+=600;
		}

		System.out.println("El precio final es "+precio+" DOLARES");
		pc.close();
	}
}