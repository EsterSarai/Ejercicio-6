import java.util.*;// importa todas las librerias de utilidad para leer en teclado

public class Numeros {
 
  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String cadena ="";
 
        while (!cadena.equals("salir")){
            if (!cadena.equals("salir")) {
                System.out.println("\n\t Ingresa el numero telefonico con el formtato que se indica");
                System.out.println("\t 502xxxxxxxx");
                System.out.println("\t Escriba \"salir\" para terminar programa");
                System.out.print("\n\t Cadena: ");
                cadena = scn.nextLine();
                String[] partes = cadena.split(",");
           
                if (partes.length == 11){
                    if (comprobarNum(partes[0]) && comprobarNum(partes[1]) && comprobarNum(partes[2]) && comprobarNum(partes[3]) && comprobarNum(partes[4])
                       && comprobarNum(partes[5]) && comprobarNum(partes[6]) && comprobarNum(partes[7]) && comprobarNum(partes[8]) && comprobarNum(partes[9] && comprobarNum(partes[10])) {//if 1 comprobar el dia de la semana
                       System.out.println("\n \t"+partes[0] + " no es un numero.");
                    }else{
                        System.out.println("\n \t  se encontro un digito introducido que no era un numero.");
                }
            }
            else //No hemos obtenido 11 partes
                System.out.println("La cadena ingresada es incorrecta favor de verificar el formato \n");
        }
       
        System.out.println("Fin de programa");
    }
   
      //Declaracion metodo comprobarSemana
        public static boolean comprobarNumeros(String num) {
         String str = cadena;
        boolean isNumeric = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNumeric = false;
            }
        }
        System.out.println(isNumeric);
    }