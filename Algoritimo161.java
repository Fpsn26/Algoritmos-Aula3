import java.util.Scanner;

public class Algoritimo161 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número: ");
            num = scan.nextDouble();

            System.out.println("O quadrado do número é: "+ Math.pow(num, 2));
        }
    }
}
