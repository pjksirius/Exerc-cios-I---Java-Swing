import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos os números são iguais.");
        }
    }
}
