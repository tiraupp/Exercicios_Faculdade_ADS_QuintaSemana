import javax.swing.*;

public class Farmacia {
    public double valor, valorAtualizado;


    public Farmacia() {
    }

    public void atualizaValor() {
        do {
           valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto a ser alterado, ou '0' para finalizar:"));
           valorAtualizado = Math.round(valor + (valor*0.12));
           if (valor == 0) {
               break;
           } else {
               JOptionPane.showMessageDialog(null,"R$"+valorAtualizado, "Valor Atualizado", JOptionPane.INFORMATION_MESSAGE);
           }
        } while (valor != 0);
    }
}
