import java.util.Scanner;

public class Algoritimo62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preço, novoPreço;
        System.out.println("Digite o preço: ");
        preço = scan.nextDouble();

        novoPreço = preço * 0.91;

        System.out.println("O novo preço é: "+novoPreço);
    }
}
