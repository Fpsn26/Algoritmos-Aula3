import java.util.Scanner;

public class Algoritimo46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float saldo;
        System.out.println("Digite o saldo: ");
        saldo = scan.nextFloat();

        double novoSaldo = saldo * 1.01;

        System.out.println("O novo saldo é: "+ novoSaldo);
    }
}
