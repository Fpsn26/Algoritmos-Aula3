import java.util.Scanner;

public class Algoritimo54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float base, altura;
        
        System.out.println("Digite a base: ");
        base = scan.nextFloat();

        System.out.println("Digite a altura: ");
        altura = scan.nextFloat();

        System.out.printf("Area do triângulo é: %.2f", (base * altura)/2);
    }
}
