package Algoritimo53;
import javax.swing.JOptionPane;


public class Algoritimo53 {
    public static void main(String[] args) {
        Paralelepipedo pp = new Paralelepipedo();
        String s;
        double valor;

        s = JOptionPane.showInputDialog("Entre com o valor da lateral A: ");
        pp.dA = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Entre com o valor da lateral B: ");
        pp.dB = Double.parseDouble(s);

        s = JOptionPane.showInputDialog("Entre com o valor da lateral C: ");
        pp.dC = Double.parseDouble(s);

        valor = Math.pow(pp.dA, 2) + Math.pow(pp.dB, 2) + Math.pow(pp.dC, 2);
        pp.dDiagonal = Math.sqrt(valor);

        JOptionPane.showMessageDialog(null,"O valor da diagonal é: " + pp.dDiagonal);
    }
}
