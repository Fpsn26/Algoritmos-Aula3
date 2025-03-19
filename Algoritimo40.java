import java.util.Scanner;

public class Algoritimo40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int dividendo = scan.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = scan.nextInt();

        float quociente = dividendo/divisor;
        float resto = dividendo % divisor;

        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
