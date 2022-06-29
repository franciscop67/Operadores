import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j=4, suma = i +j; //De esta manera tambien podemos declar y asignar variables
        System.out.println("Suma= " + suma);
        System.out.println("i+j = " + i+j); //String concatena

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);
        
        int div =  i / j;
        float div2 = (float)i /j; //Permite el cast. Permite cambiar el tipo de dato.
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto =  8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar= " + numero);
        }
    }
}
