import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digita el numero:  ");
        int limite = teclado.nextInt();
        teclado.close();

        for(int i = 0; i<limite; i++){
            System.out.print(Ejercicios.fibonacci(i) + ", ");
        }
        System.out.println(" ");

    }
}
