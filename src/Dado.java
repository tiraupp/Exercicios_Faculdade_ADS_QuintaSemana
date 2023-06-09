import javax.swing.*;

public class Dado {

    public int [] jogadas = new int[3];
    public int total;

    public Dado() {

    }

    public void jogarDado() {
        total = 0;
        int i;
        for (i=0;i<3;i++) {
            jogadas[i] = (int) Math.round(Math.random()*6);
            total = total + jogadas[i];
        }
    }

    public void mostrarJogada() {
        jogarDado();
        JOptionPane.showMessageDialog(null, "Números sorteados: " +
                "\nJogada 1: " + jogadas[0] +
                "\nJogada 2: " + jogadas[1] +
                "\nJogada 3: " + jogadas[2] +
                "\nTotal de pontos: " + total);
    }
}
