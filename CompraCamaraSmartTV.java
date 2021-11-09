import java.util.Scanner;

public class JavaApplication4 {
	public static void main(String[] args) {
		Scanner pc= new Scanner(System.in);
		String user;
		int precio=0;

		System.out.println("Indica tipo de aparato: Camara(25$), SmartTV(350$), Desktop(500$), Laptop(600$), Phone(50$) o Smartphone(250$) ");
		user= pc.nextLine();
		
		if (user.equals("Phone")) {
			System.out.println("Ha escogido ordenador de Phone");
			precio+=500;
		}

		if (user.equals("Smartphone")){
			System.out.println("Ha escogido Smartphone");
			precio+=600;

		if (user.equals("Camara")) {
			System.out.println("Ha escogido ordenador de Camara");
			precio+=500;
		}

		if (user.equals("SmartTV")){
			System.out.println("Ha escogido SmartTV");
			precio+=600;
		}

			
		if (user.equals("Desktop")) {
			System.out.println("Ha escogido ordenador de Desktop");
			precio+=500;
		}

		if (user.equals("Laptop")){
			System.out.println("Ha escogido ordenador Laptop");
			precio+=600;
		}

		System.out.println("indica tipo de procesador: i3(0$) / i5(200$) / i7(300$)");
		user= pc.nextLine();
		if (user.equals("i3")){
			System.out.println("Ha escogido procesador i3");
		}
		if (user.equals("i5")){
			System.out.println("Ha escogido procesador i5");
			precio+=200;
		}
		if (user.equals("i7")){
			System.out.println("Ha escogido procesador i7");
			precio+=300;
		}

		System.out.println("indica tipo de disco duro: Disco duro mecánico(0$) o Disco duro sólido/ (300$)");
		user= pc.nextLine();
		if (user.equals("Disco duro mecánico")){
			System.out.println("Ha escogido Disco duro mecánico");
		}
		if (user.equals("Disco duro sólido")){
			System.out.println("Ha escogido Disco duro sólido");
			precio+=300;
		}

		System.out.println("indica capacidad del disco duro: 250gb(0$) / 500gb (200$) / 750gb (300$)");
		user= pc.nextLine();
		if (user.equals("250gb")){
			System.out.println("Ha escogido usted disco duro de 250gb");
		}
		if (user.equals("500gb")){
			System.out.println("Ha escogido usted disco duro de 500gb");
			precio+=200;
		}
		if (user.equals("750gb")){
			System.out.println("Ha escogido usted disco duro de 750gb");
			precio+=300;
		}

		System.out.println("indica tipo memoria ram 8gb(0$): 16gb(200$)");
		user= pc.nextLine();
		if (user.equals("8gb")){
			System.out.println("Ha escogido 8gb");
		}
		if (user.equals("16gb")){
			System.out.println("Ha escogido 16gb");
			precio+=200;
		}
		}

		System.out.println("El precio final es "+precio+" DOLARES");
		pc.close();
	}
}
