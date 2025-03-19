import java.util.Scanner;

public class Algoritimo207 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplicando, multiplicador, soma;
        System.out.println("Digite o multiplicando: ");
        multiplicando = scan.nextInt();

        System.out.println("Digite o multiplicador: ");
        multiplicador = scan.nextInt();

        soma = 0;

        for(int i = 1; i <= multiplicador; i++){
            soma = soma + multiplicando;
        }
        System.out.println("Produto: "+soma);
    }
}