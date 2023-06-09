import javax.swing.*;

public class ElevarPotencia {

    public double valor, resultado;

    public int potencia;

    public ElevarPotencia() {
    }

    public void calcularPotencia() {
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor ", "Valor", JOptionPane.QUESTION_MESSAGE));
        potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe qual potência para elevar: ", "Potência", JOptionPane.QUESTION_MESSAGE));
        resultado = Math.pow(valor,potencia);

        JOptionPane.showMessageDialog(null, "Resultado de "+valor+" elevado na potência "+potencia+ " = \n" + resultado, "Resultado - Math.pow()", JOptionPane.INFORMATION_MESSAGE);

    }

}
