import javax.swing.*;

public class FraseInvertida {

    public String frase = new String();
    public StringBuilder invertida = new StringBuilder();

    public FraseInvertida() {
    }

    public void removeSpaco(){
        frase = frase.replaceAll("\\s","");
    }

    public void inverteFrase(){
        invertida = new StringBuilder(frase);
        invertida.reverse();
    }

    public void fraseReversa() {
        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ", "Frase", JOptionPane.QUESTION_MESSAGE);
        removeSpaco();
        inverteFrase();
        JOptionPane.showMessageDialog(null,"A frase invertida ficou: \n" + invertida, "Frase Invertida", JOptionPane.INFORMATION_MESSAGE);

    }

}
