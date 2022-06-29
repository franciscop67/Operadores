import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero: si es falso
        //Sirve como alternativa al if-else
        String variable = 7 == 5? "si es verdadero": "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota de matematicas");
        matematicas = scanner.nextDouble();
        System.out.println("Ingresa la nota de ciencias");
        ciencias = scanner.nextDouble();
        System.out.println("Ingresa la nota de historia");
        historia = scanner.nextDouble();


        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado =  promedio >= 5.49? "Aprobado":"Rechazado";
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){
            estado =  "Aprobado";
        }else{
            estado = "Rechazado";
        }*/



    }
}
