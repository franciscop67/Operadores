import java.util.Scanner;

public class ejercicioUnoTernario {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int num1 =  s.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 =  s.nextInt();

        max =  num1 > num2?num1:num2;

        System.out.println("El numero mayor es: " + max);

    }
}
