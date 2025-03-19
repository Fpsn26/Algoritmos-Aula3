import java.util.Scanner;

public class Algoritimo55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float diagonalMaior, diagonalMenor, area;
        System.out.println("Digite o valor da Diagonal Maior: ");
        diagonalMaior = scan.nextFloat();
        System.out.println("Digite o valor da Diagonal Menor: ");
        diagonalMenor = scan.nextFloat();

        area = (diagonalMaior * diagonalMenor)/2;

        System.out.printf("A área do losango é: %.2f ", area);

    }    
}
