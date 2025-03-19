import java.util.Scanner;

public class Algoritimo187 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, expoente, potencia;
        System.out.println("Digite uma base inteira e maior que 1: ");
        base = scan.nextInt();
        System.out.println("Digite um expoente inteiro e maior que 1: ");
        expoente = scan.nextInt();
        
        if (base >= 2 && expoente > 1){
            potencia = 1;
            for (int i = 1; i <= expoente; i++){
                potencia = potencia * base;
            }
            System.out.println("Potência: "+ potencia);
        }else{
            System.out.println("Não satisfazem");
        }
    }
}
