import java.util.Scanner;

public class ejercicioDosTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double cantidad;
        System.out.println("Ingresa la cantidad de gasolina que tienes");
        cantidad =  scanner.nextDouble();


        if (cantidad == 70){
            System.out.println("Tanque lleno");
        } else if (cantidad >=60 && cantidad < 70) {
            System.out.println("Tanque casi lleno");
        } else if (cantidad >=40 && cantidad < 60) {
            System.out.println("Tanque 3/4");
        } else if (cantidad>=35 && cantidad <40) {
            System.out.println("Medio tanque");
        } else if (cantidad >=20 && cantidad<35) {
            System.out.println("Suficiente");
        } else if (cantidad >=0 && cantidad <20) {
            System.out.println("Insuficiente");
        }else {
            System.out.println("La maxima cantidad de litros son 70");
        }
    }
}
