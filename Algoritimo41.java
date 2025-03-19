import java.util.Scanner;

public class Algoritimo41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float val1, val2, val3, val4, mediaPonderada;
        System.out.println("Digite o primeiro valor: ");
        val1 = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        val2 = scan.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        val3 = scan.nextFloat();
        System.out.println("Digite o quarto valor: ");
        val4 = scan.nextFloat();

        mediaPonderada = (val1*1 + val2*2 + val3*3 + val4*4)/10;

        System.out.printf("A média ponderada é: %.2f ", mediaPonderada);
    }
}
