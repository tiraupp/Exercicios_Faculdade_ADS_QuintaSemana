import javax.swing.*;
import java.util.Locale;

public class FraseSemUltimoCaracter {

    public String frase = new String();

    public FraseSemUltimoCaracter() {
    }

    public void removeUltimoCaracter() {
        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ", "Frase", JOptionPane.QUESTION_MESSAGE);
        frase = frase.substring(0, frase.length()-1);

        JOptionPane.showMessageDialog(null, "Resultado da frase removendo último caracter: \n" + frase, "Frase", JOptionPane.INFORMATION_MESSAGE);

    }
}
