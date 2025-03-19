import java.util.Scanner;

public class Algoritimo64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fahrenheit, celcius;
        System.out.println("Digite a temperatura em celcius: ");
        celcius = scan.nextDouble();
        
        fahrenheit = (9 * celcius + 160)/5;

        System.out.println("A temperatura em fahrenheit é: "+fahrenheit);
    }
}
