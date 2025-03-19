import java.util.Scanner;

public class Algoritimo59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cateto1, cateto2;
        System.out.println("Entre com o valor do primeiro cateto: ");
        cateto1 = scan.nextFloat();
        System.out.println("Entre com o valor do segundo cateto: ");
        cateto2 = scan.nextFloat();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}
