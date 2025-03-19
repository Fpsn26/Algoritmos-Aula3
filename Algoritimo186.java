import java.util.Scanner;

public class Algoritimo186 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;

        for (int i = 1; i <= 4; i++){
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();

            System.out.println("O cubo do número é: "+ Math.pow(numero, 3));

            if(numero < 0){
                System.out.println("Não é possível fazer raíz de números negativos");
            }else{
                System.out.println("A raiz cúbica do número é: " + Math.cbrt(numero));
            }
        }
    }
}
