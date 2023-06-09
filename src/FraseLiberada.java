import javax.swing.*;
import java.util.Locale;




public class FraseLiberada {

    public String frase = new String();

    public FraseLiberada() {
    }


    public void verificaConteudo() {
        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ", "Frase", JOptionPane.QUESTION_MESSAGE);
        if (frase.toUpperCase(Locale.ROOT).contains("SEXO") || frase.toUpperCase(Locale.ROOT).contains("SEXUAL") || frase.toUpperCase(Locale.ROOT).contains("SEXUAIS")) {
            JOptionPane.showMessageDialog(null, "A frase não pode ser exibida, possui conteúdo impróprio !", "Frase Bloqueada", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A frase foi liberada: \n" + frase, "Frase Liberada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
