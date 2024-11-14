import javax.swing.JOptionPane;

public class MediaAprovacao {
        public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota:"));

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nAluno Aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nAluno Reprovado");
        }
    }

}
