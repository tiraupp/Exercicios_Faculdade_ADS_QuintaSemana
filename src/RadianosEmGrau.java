import javax.swing.*;

public class RadianosEmGrau {

    public double radianos, resultado;

    public RadianosEmGrau() {
    }

    public void conversaoRadianosEmGrau() {
        radianos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor radiano :", "Valor", JOptionPane.QUESTION_MESSAGE));
        resultado = Math.toDegrees(radianos);

        JOptionPane.showMessageDialog(null, "Resultado de "+radianos+" radianos convertido para graus é = \n" + resultado, "Resultado - Math.toDegrees()", JOptionPane.INFORMATION_MESSAGE);

    }
}
