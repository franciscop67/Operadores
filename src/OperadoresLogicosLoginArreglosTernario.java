import java.util.Scanner;

public class OperadoresLogicosLoginArreglosTernario {
    public static void main(String[] args) {

        /*String [] usernames = new String[3];//De esta manera se crea un arreglo
        String [] passwords = new String[3];
        usernames [0] = "francisco";//Determinamos la posicion [0]
        passwords [0] = "12345";
        usernames [1] = "admin";//Determinamos la posicion [1]
        passwords [1] = "12345";
        usernames [2] = "pepe";//Determinamos la posicion [1]
        passwords [2] = "12345";*/

        //Otra manera
        String [] usernames = {"francisco","admin","pepe"};
        String [] passwords = {"12345", "12345" , "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el username");

        String u = scanner.nextLine();

        System.out.println("Ingresa el password");
        String p = scanner.nextLine();

        boolean esAutenticado =  false;

        for (int i=0; i<usernames.length; i++){

            esAutenticado =  (usernames [i].equals(u) && passwords [i].equals(p))? true:esAutenticado;
            /*if( usernames [i].equals(u) && passwords [i].equals(p)){
                esAutenticado =  true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"):
                "Lo siento, requiere autentificación \n Username o contraseña incorrecto!";
        System.out.println("mensaje = " + mensaje);
        /*if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autentificación");
            System.out.println("Username o contraseña incorrecto!");
        }*/
    }
}
